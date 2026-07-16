package dao;

import database.KoneksiDatabase;
import model.Pasien;
import util.AppException;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PasienDAO {

    // INSERT menggunakan Stored Procedure tambah_pasien
    public void tambah(Pasien pasien) throws AppException {
        String sql = "{CALL tambah_pasien(?, ?, ?)}";

        try (Connection conn = KoneksiDatabase.getKoneksi();
             CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setString(1, pasien.getNama());
            stmt.setInt(2, pasien.getUmur());
            stmt.setString(3, pasien.getAlamat());

            stmt.execute();

        } catch (SQLException e) {
            throw new AppException("Gagal menambahkan data pasien: " + e.getMessage(), e);
        }
    }

    // SELECT seluruh data pasien
    public List<Pasien> tampilkanSemua() throws AppException {
        List<Pasien> daftarPasien = new ArrayList<>();
        String sql = "SELECT id_pasien, nama_pasien, umur, alamat FROM pasien";

        try (Connection conn = KoneksiDatabase.getKoneksi();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Pasien pasien = new Pasien(
                        rs.getInt("id_pasien"),
                        rs.getString("nama_pasien"),
                        rs.getInt("umur"),
                        rs.getString("alamat")
                );
                daftarPasien.add(pasien);
            }

        } catch (SQLException e) {
            throw new AppException("Gagal mengambil data pasien: " + e.getMessage(), e);
        }

        return daftarPasien;
    }

    // Memanggil FUNCTION total_pasien()
    public int hitungTotalPasien() throws AppException {
        String sql = "SELECT total_pasien() AS total";

        try (Connection conn = KoneksiDatabase.getKoneksi();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                return rs.getInt("total");
            }

        } catch (SQLException e) {
            throw new AppException("Gagal menghitung total pasien: " + e.getMessage(), e);
        }

        return 0;
    }
}