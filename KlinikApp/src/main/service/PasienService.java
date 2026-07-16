package service;

import dao.PasienDAO;
import model.Pasien;
import util.AppException;

import java.util.List;

public class PasienService extends DataService {

    private Pasien pasien;
    private static final PasienDAO pasienDAO = new PasienDAO();

    public PasienService(Pasien pasien) {
        this.pasien = pasien;
    }

    @Override
    public void simpan() throws AppException {
        pasienDAO.tambah(pasien);
    }

    @Override
    public void tampilkan() {
        System.out.println(pasien.getInfo());
    }

    // Method static untuk menampilkan seluruh data pasien dari database
    public static void tampilkanSemua() throws AppException {
        List<Pasien> daftarPasien = pasienDAO.tampilkanSemua();

        if (daftarPasien.isEmpty()) {
            System.out.println("Belum ada data pasien.");
            return;
        }

        System.out.println("\n--- Daftar Pasien ---");
        for (Pasien p : daftarPasien) {
            System.out.println(p.getInfo());
        }

        int total = pasienDAO.hitungTotalPasien();
        System.out.println("Total pasien: " + total);
    }
}