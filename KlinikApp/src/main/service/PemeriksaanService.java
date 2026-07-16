package service;

import dao.PemeriksaanDAO;
import model.Pemeriksaan;
import util.AppException;

import java.util.List;

public class PemeriksaanService extends DataService {

    private Pemeriksaan pemeriksaan;
    private static final PemeriksaanDAO pemeriksaanDAO = new PemeriksaanDAO();

    public PemeriksaanService(Pemeriksaan pemeriksaan) {
        this.pemeriksaan = pemeriksaan;
    }

    @Override
    public void simpan() throws AppException {
        pemeriksaanDAO.tambah(pemeriksaan);
    }

    @Override
    public void tampilkan() {
        System.out.println("Keluhan: " + pemeriksaan.getKeluhan());
    }

    public static void tampilkanRiwayat() throws AppException {
        List<String> riwayat = pemeriksaanDAO.tampilkanRiwayat();

        if (riwayat.isEmpty()) {
            System.out.println("Belum ada riwayat pemeriksaan.");
            return;
        }

        System.out.println("\n--- Riwayat Pemeriksaan ---");
        for (String baris : riwayat) {
            System.out.println(baris);
        }
    }
}