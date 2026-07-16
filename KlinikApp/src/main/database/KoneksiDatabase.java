package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiDatabase {

    // Konfigurasi koneksi - sesuaikan dengan setting MySQL Anda
    private static final String URL = "jdbc:mysql://localhost:3306/db_klinik";
    private static final String USER = "root";
    private static final String PASSWORD = ""; // isi jika MySQL Anda pakai password

    private static Connection koneksi = null;

    // Private constructor supaya class ini tidak bisa di-instantiate langsung
    private KoneksiDatabase() {
    }

    public static Connection getKoneksi() {
        try {
            if (koneksi == null || koneksi.isClosed()) {
                koneksi = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Koneksi ke database berhasil.");
            }
        } catch (SQLException e) {
            System.out.println("Gagal terhubung ke database: " + e.getMessage());
        }
        return koneksi;
    }
}