package menu;

import model.Pasien;
import model.Dokter;
import model.Pemeriksaan;
import service.PasienService;
import service.DokterService;
import service.PemeriksaanService;
import util.AppException;
import util.InputHelper;

public class MenuUtama {

    private PasienService pasienService;
    private DokterService dokterService;
    private PemeriksaanService pemeriksaanService;

    public void tampilkan() {
        boolean lanjut = true;

        while (lanjut) {
            System.out.println("\n===== APLIKASI MANAJEMEN KLINIK =====");
            System.out.println("1. Menu Pasien");
            System.out.println("2. Menu Dokter");
            System.out.println("3. Menu Pemeriksaan");
            System.out.println("4. Keluar");

            int pilihan = InputHelper.bacaAngka("Pilih menu: ");

            switch (pilihan) {
                case 1:
                    menuPasien();
                    break;
                case 2:
                    menuDokter();
                    break;
                case 3:
                    menuPemeriksaan();
                    break;
                case 4:
                    lanjut = false;
                    System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }
    }

    private void menuPasien() {
        System.out.println("\n--- Menu Pasien ---");
        System.out.println("1. Tambah Pasien");
        System.out.println("2. Lihat Data Pasien");
        System.out.println("3. Kembali");

        int pilihan = InputHelper.bacaAngka("Pilih menu: ");

        switch (pilihan) {
            case 1:
                tambahPasien();
                break;
            case 2:
                lihatDataPasien();
                break;
            case 3:
                return;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    private void tambahPasien() {
        String nama = InputHelper.bacaTeks("Nama pasien: ");
        int umur = InputHelper.bacaAngka("Umur: ");
        String alamat = InputHelper.bacaTeks("Alamat: ");

        Pasien pasien = new Pasien(nama, umur, alamat);
        pasienService = new PasienService(pasien);

        try {
            pasienService.simpan();
            System.out.println("Data pasien berhasil disimpan.");
        } catch (AppException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void lihatDataPasien() {
        try {
            PasienService.tampilkanSemua();
        } catch (AppException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void menuDokter() {
        System.out.println("\n--- Menu Dokter ---");
        System.out.println("1. Tambah Dokter");
        System.out.println("2. Lihat Data Dokter");
        System.out.println("3. Kembali");

        int pilihan = InputHelper.bacaAngka("Pilih menu: ");

        switch (pilihan) {
            case 1:
                tambahDokter();
                break;
            case 2:
                lihatDataDokter();
                break;
            case 3:
                return;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    private void tambahDokter() {
        String nama = InputHelper.bacaTeks("Nama dokter: ");
        String spesialis = InputHelper.bacaTeks("Spesialis: ");

        Dokter dokter = new Dokter(nama, spesialis);
        dokterService = new DokterService(dokter);

        try {
            dokterService.simpan();
            System.out.println("Data dokter berhasil disimpan.");
        } catch (AppException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void lihatDataDokter() {
        try {
            DokterService.tampilkanSemua();
        } catch (AppException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void menuPemeriksaan() {
        System.out.println("\n--- Menu Pemeriksaan ---");
        System.out.println("1. Tambah Pemeriksaan");
        System.out.println("2. Lihat Riwayat Pemeriksaan");
        System.out.println("3. Kembali");

        int pilihan = InputHelper.bacaAngka("Pilih menu: ");

        switch (pilihan) {
            case 1:
                tambahPemeriksaan();
                break;
            case 2:
                lihatRiwayatPemeriksaan();
                break;
            case 3:
                return;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    private void tambahPemeriksaan() {
        int idPasien = InputHelper.bacaAngka("ID Pasien: ");
        int idDokter = InputHelper.bacaAngka("ID Dokter: ");
        String keluhan = InputHelper.bacaTeks("Keluhan: ");

        Pemeriksaan pemeriksaan = new Pemeriksaan(idPasien, idDokter, keluhan);
        pemeriksaanService = new PemeriksaanService(pemeriksaan);

        try {
            pemeriksaanService.simpan();
            System.out.println("Data pemeriksaan berhasil disimpan.");
        } catch (AppException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void lihatRiwayatPemeriksaan() {
        try {
            PemeriksaanService.tampilkanRiwayat();
        } catch (AppException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}