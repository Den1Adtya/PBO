package dao;

import database.KoneksiDatabase;
import model.Pemeriksaan;
import util.AppException;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PemeriksaanDAO {

    // INSERT data pemeriksaan (tanggal_periksa sengaja tidak diisi, diisi otomatis oleh TRIGGER)
    public void tambah(Pemeriksaan pemeriksaan) throws AppException {
        String sql = "INSERT INTO pemeriksaan (id_pasien, id_dokter, keluhan) VALUES (?, ?, ?)";

        try (Connection conn = KoneksiDatabase.getKoneksi();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, pemeriksaan.getIdPasien());
            stmt.setInt(2, pemeriksaan.getIdDokter());
            stmt.setString(3, pemeriksaan.getKeluhan());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new AppException("Gagal menambahkan data pemeriksaan: " + e.getMessage(), e);
        }
    }

    // SELECT dari VIEW v_riwayat_pemeriksaan (bukan dari tabel langsung)
    public List<String> tampilkanRiwayat() throws AppException {
        List<String> daftarRiwayat = new ArrayList<>();
        String sql = "SELECT nama_pasien, nama_dokter, keluhan, tanggal_periksa FROM v_riwayat_pemeriksaan";

        try (Connection conn = KoneksiDatabase.getKoneksi();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String baris = "Pasien: " + rs.getString("nama_pasien")
                        + " | Dokter: " + rs.getString("nama_dokter")
                        + " | Keluhan: " + rs.getString("keluhan")
                        + " | Tanggal: " + rs.getDate("tanggal_periksa");
                daftarRiwayat.add(baris);
            }

        } catch (SQLException e) {
            throw new AppException("Gagal mengambil riwayat pemeriksaan: " + e.getMessage(), e);
        }

        return daftarRiwayat;
    }
}