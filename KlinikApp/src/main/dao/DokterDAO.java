package dao;

import database.KoneksiDatabase;
import model.Dokter;
import util.AppException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DokterDAO {

    // INSERT langsung tanpa Stored Procedure (perbandingan dengan PasienDAO)
    public void tambah(Dokter dokter) throws AppException {
        String sql = "INSERT INTO dokter (nama_dokter, spesialis) VALUES (?, ?)";

        try (Connection conn = KoneksiDatabase.getKoneksi();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, dokter.getNama());
            stmt.setString(2, dokter.getSpesialis());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new AppException("Gagal menambahkan data dokter: " + e.getMessage(), e);
        }
    }

    // SELECT seluruh data dokter
    public List<Dokter> tampilkanSemua() throws AppException {
        List<Dokter> daftarDokter = new ArrayList<>();
        String sql = "SELECT id_dokter, nama_dokter, spesialis FROM dokter";

        try (Connection conn = KoneksiDatabase.getKoneksi();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Dokter dokter = new Dokter(
                        rs.getInt("id_dokter"),
                        rs.getString("nama_dokter"),
                        rs.getString("spesialis")
                );
                daftarDokter.add(dokter);
            }

        } catch (SQLException e) {
            throw new AppException("Gagal mengambil data dokter: " + e.getMessage(), e);
        }

        return daftarDokter;
    }
}