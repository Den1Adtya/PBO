package Tugas_7.No3.main;
//Deni Aditya Saputra
import java.util.Scanner;

import Tugas_7.No3.model.*;
import Tugas_7.No3.service.*;

public class MainApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        PerangkatService<PerangkatInput> service = new PerangkatService<>();

        int pilih;

        do {
            System.out.println("\n=== MENU PERANGKAT ===");
            System.out.println("1. Tambah Keyboard");
            System.out.println("2. Tambah Mouse");
            System.out.println("3. Tambah Gamepad");
            System.out.println("4. Tampilkan Semua");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String namaK = input.nextLine();
                    System.out.print("Merk: ");
                    String merkK = input.nextLine();
                    System.out.print("Harga: ");
                    int hargaK = input.nextInt();
                    input.nextLine();
                    System.out.print("Jenis Switch: ");
                    String switchK = input.nextLine();
                    System.out.print("Wireless (true/false): ");
                    boolean wk = input.nextBoolean();

                    service.tambah(new Keyboard(namaK, merkK, hargaK, switchK, wk));
                    break;

                case 2:
                    System.out.print("Nama: ");
                    String namaM = input.nextLine();
                    System.out.print("Merk: ");
                    String merkM = input.nextLine();
                    System.out.print("Harga: ");
                    int hargaM = input.nextInt();
                    System.out.print("Wireless (true/false): ");
                    boolean wm = input.nextBoolean();

                    service.tambah(new Mouse(namaM, merkM, hargaM, wm));
                    break;

                case 3:
                    System.out.print("Nama: ");
                    String namaG = input.nextLine();
                    System.out.print("Merk: ");
                    String merkG = input.nextLine();
                    System.out.print("Harga: ");
                    int hargaG = input.nextInt();
                    System.out.print("Wireless (true/false): ");
                    boolean wg = input.nextBoolean();

                    service.tambah(new Gamepad(namaG, merkG, hargaG, wg));
                    break;

                case 4:
                    service.tampil();
                    break;
            }

        } while (pilih != 0);

        System.out.println("---Program selesai---");
    }
}
