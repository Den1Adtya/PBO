package service;

import dao.DokterDAO;
import model.Dokter;
import util.AppException;

import java.util.List;

public class DokterService extends DataService {

    private Dokter dokter;
    private static final DokterDAO dokterDAO = new DokterDAO();

    public DokterService(Dokter dokter) {
        this.dokter = dokter;
    }

    @Override
    public void simpan() throws AppException {
        dokterDAO.tambah(dokter);
    }

    @Override
    public void tampilkan() {
        System.out.println(dokter.getInfo());
    }

    public static void tampilkanSemua() throws AppException {
        List<Dokter> daftarDokter = dokterDAO.tampilkanSemua();

        if (daftarDokter.isEmpty()) {
            System.out.println("Belum ada data dokter.");
            return;
        }

        System.out.println("\n--- Daftar Dokter ---");
        for (Dokter d : daftarDokter) {
            System.out.println(d.getInfo());
        }
    }
}