package Tugas_3;

import java.util.Scanner;
import java.util.ArrayList;

public class ProgramNilai extends Mahasiswa {
    // Konstruktor untuk Child Class
    public ProgramNilai(String nim, String nama, int nilai) {
        super(nim, nama, nilai);
        tentukanGrade();
    }

    private void tentukanGrade() {
        if (nilai >= 80 && nilai <= 100) {
            grade = "A";
            status = "Lulus";
        } else if (nilai >= 70) {
            grade = "B";
            status = "Lulus";
        } else if (nilai >= 60) {
            grade = "C";
            status = "Lulus";
        } else if (nilai >= 50) {
            grade = "D";
            status = "Tidak Lulus";
        } else if (nilai >= 0 && nilai < 50) {
            grade = "E";
            status = "Tidak Lulus";
        } else {
            grade = "Error";
            System.out.println("Input nilai anda salah!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ProgramNilai> listMhs = new ArrayList<>();
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); // clear buffer

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("NIM  : "); String nim = sc.nextLine();
            System.out.print("Nama : "); String nama = sc.nextLine();
            System.out.print("Nilai: "); int nilai = sc.nextInt();
            sc.nextLine();

            listMhs.add(new ProgramNilai(nim, nama, nilai));
        }

        // Output Display & Statistics logic
        double totalNilai = 0;
        int lulus = 0, tdkLulus = 0;
        StringBuilder nmA = new StringBuilder(), nmB = new StringBuilder(), nmD = new StringBuilder(), nmLulus = new StringBuilder(), nmTdkLulus = new StringBuilder();

        System.out.println("\n--- HASIL OUTPUT ---");
        for (ProgramNilai m : listMhs) {
            System.out.println("NIM   : " + m.nim + "\nNama  : " + m.nama + "\nNilai : " + m.nilai + "\nGrade : " + m.grade);
            System.out.println("=====================================");
            
            totalNilai += m.nilai;
            if (m.status.equals("Lulus")) { lulus++; nmLulus.append(m.nama).append(", "); }
            else { tdkLulus++; nmTdkLulus.append(m.nama).append(", "); }
            
            if (m.grade.equals("A")) nmA.append(m.nama).append(", ");
            if (m.grade.equals("B")) nmB.append(m.nama).append(", ");
            if (m.grade.equals("D")) nmD.append(m.nama).append(", ");
        }

        // Tampilkan Statistik Akhir
        System.out.println("Jumlah Mahasiswa : " + jumlah);
        System.out.println("Jumlah Mahasiswa yg Lulus : " + lulus + " yaitu " + nmLulus);
        System.out.println("Jumlah Mahasiswa yg Tidak Lulus : " + tdkLulus + " yaitu " + nmTdkLulus);
        System.out.println("Jumlah Mahasiswa dengan Nilai A = " + nmA);
        System.out.println("Rata-rata nilai mahasiswa adalah : " + (totalNilai / jumlah));

        sc.close();
    }
}