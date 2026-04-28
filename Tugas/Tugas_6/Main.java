package Tugas_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Laptop M1_Pro = new Macbook();
        LaptopUser ibnu = new LaptopUser(M1_Pro);
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU LAPTOP ===");
        System.out.println("1. Ketik 'ON' Untuk Menyalakan Laptop.");
        System.out.println("2. Ketik 'OFF' Untuk Mematikan Laptop.");
        System.out.println("3. Ketik 'UP' Untuk Menambah Volume.");
        System.out.println("4. Ketik 'DOWN' Untuk Mengurangi Volume.");
        System.out.println("5. Ketik 'EXIT' Untuk Keluar dari program.");
        
        while (true) {
            System.out.print("\nMasukkan Perintah: ");
            String perintah = input.nextLine().toUpperCase();
            if (perintah.equals("ON")) {
                ibnu.turnOnLaptop();
            } else if (perintah.equals("OFF")) {
                ibnu.turnOffLaptop();
                break;
            } else if (perintah.equals("UP")) {
                ibnu.makeLaptopLouder();
            } else if (perintah.equals("DOWN")) {
                ibnu.makeLaptopSilence();
            } else {
                System.out.println("TIDAK ADA DALAM MENU PERINTAH!");
            }
        }

        input.close();
        System.out.println("Menu Selesai.");
    }    
}