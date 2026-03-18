import java.util.ArrayList;
import java.util.Scanner;

// Class Mahasiswa sebagai blueprint objek
class Mahasiswa {
    private String nim;
    private String nama;
    private int nilai;
    private String grade;

    // Constructor
    public Mahasiswa(String nim, String nama, int nilai) {
        this.nim   = nim;
        this.nama  = nama;
        this.nilai = nilai;
        this.grade = tentukanGrade(nilai);
    }

    // Method menentukan grade
    private String tentukanGrade(int nilai) {
        if (nilai < 0 || nilai > 100) {
            return "INVALID";
        } else if (nilai >= 80) {
            return "A";
        } else if (nilai >= 70) {
            return "B";
        } else if (nilai >= 60) {
            return "C";
        } else if (nilai >= 50) {
            return "D";
        } else {
            return "E";
        }
    }

    // Getter
    public String getNim()   { return nim;   }
    public String getNama()  { return nama;  }
    public int    getNilai() { return nilai; }
    public String getGrade() { return grade; }

    // Method tampilkan data satu mahasiswa
    public void tampilkan() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Nilai : " + nilai);
        System.out.println("Grade : " + grade);
        System.out.println("========================================");
    }

    // Cek apakah lulus (grade A, B, atau C)
    public boolean isLulus() {
        return grade.equals("A") || grade.equals("B") || grade.equals("C");
    }
}

// Class utama program
public class NilaiMahasiswa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); // flush newline

        // Input data mahasiswa
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\n--- Data Mahasiswa ke-" + (i + 1) + " ---");
            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Nilai : ");
            int nilai = sc.nextInt();
            sc.nextLine(); // flush newline

            // Validasi nilai di luar 0–100
            if (nilai < 0 || nilai > 100) {
                System.out.println("Input nilai anda salah");
                i--; // ulangi iterasi ini
                continue;
            }

            listMahasiswa.add(new Mahasiswa(nim, nama, nilai));
        }

        // Tampilkan data semua mahasiswa
        System.out.println("\n========================================");
        for (Mahasiswa m : listMahasiswa) {
            m.tampilkan();
        }

        // ── Statistik ──────────────────────────────────────────
        int totalNilai    = 0;
        int jumlahLulus   = 0;
        int jumlahTLulus  = 0;
        int jumlahA = 0, jumlahB = 0, jumlahC = 0, jumlahD = 0, jumlahE = 0;

        StringBuilder namaLulus  = new StringBuilder();
        StringBuilder namaTLulus = new StringBuilder();
        StringBuilder namaA = new StringBuilder();
        StringBuilder namaB = new StringBuilder();
        StringBuilder namaC = new StringBuilder();
        StringBuilder namaD = new StringBuilder();
        StringBuilder namaE = new StringBuilder();

        for (Mahasiswa m : listMahasiswa) {
            totalNilai += m.getNilai();

            if (m.isLulus()) {
                jumlahLulus++;
                if (namaLulus.length() > 0) namaLulus.append(", ");
                namaLulus.append(m.getNama());
            } else {
                jumlahTLulus++;
                if (namaTLulus.length() > 0) namaTLulus.append(", ");
                namaTLulus.append(m.getNama());
            }

            switch (m.getGrade()) {
                case "A":
                    jumlahA++;
                    if (namaA.length() > 0) namaA.append(", ");
                    namaA.append(m.getNama());
                    break;
                case "B":
                    jumlahB++;
                    if (namaB.length() > 0) namaB.append(", ");
                    namaB.append(m.getNama());
                    break;
                case "C":
                    jumlahC++;
                    if (namaC.length() > 0) namaC.append(", ");
                    namaC.append(m.getNama());
                    break;
                case "D":
                    jumlahD++;
                    if (namaD.length() > 0) namaD.append(", ");
                    namaD.append(m.getNama());
                    break;
                case "E":
                    jumlahE++;
                    if (namaE.length() > 0) namaE.append(", ");
                    namaE.append(m.getNama());
                    break;
            }
        }

        double rata = (double) totalNilai / listMahasiswa.size();

        // Hitung rata-rata dengan format tampilan seperti soal (tanpa desimal jika bulat)
        StringBuilder rumusRata = new StringBuilder();
        for (int i = 0; i < listMahasiswa.size(); i++) {
            if (i > 0) rumusRata.append("+");
            rumusRata.append(listMahasiswa.get(i).getNilai());
        }
        rumusRata.append(" / ").append(listMahasiswa.size());

        System.out.println("Jumlah Mahasiswa : " + listMahasiswa.size());
        System.out.println("Jumlah Mahasiswa yg Lulus : " + jumlahLulus + " yaitu " + namaLulus);
        System.out.println("Jumlah Mahasiswa yg Tidak Lulus : " + jumlahTLulus + " yaitu " + namaTLulus);

        if (jumlahA > 0)
            System.out.println("Jumlah Mahasiswa dengan Nilai A = " + jumlahA + " yaitu " + namaA);
        if (jumlahB > 0)
            System.out.println("Jumlah Mahasiswa dengan Nilai B = " + jumlahB + " yaitu " + namaB);
        if (jumlahC > 0)
            System.out.println("Jumlah Mahasiswa dengan Nilai C = " + jumlahC + " yaitu " + namaC);
        if (jumlahD > 0)
            System.out.println("Jumlah Mahasiswa dengan Nilai D = " + jumlahD + " yaitu " + namaD);
        if (jumlahE > 0)
            System.out.println("Jumlah Mahasiswa dengan Nilai E = " + jumlahE + " yaitu " + namaE);

        // Format rata-rata: tampilkan tanpa desimal jika bulat
        String rataStr = (rata == Math.floor(rata))
                ? String.valueOf((int) rata)
                : String.valueOf(rata);

        System.out.println("Rata-rata nilai mahasiswa adalah : "
                + rumusRata + " = " + rataStr);

        sc.close();
    }
}