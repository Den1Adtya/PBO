package model;

import java.time.LocalDate;

public class Pemeriksaan {

    private int idPeriksa;
    private int idPasien;
    private int idDokter;
    private String keluhan;
    private LocalDate tanggalPeriksa;

    public Pemeriksaan() {
    }

    public Pemeriksaan(int idPasien, int idDokter, String keluhan) {
        this.idPasien = idPasien;
        this.idDokter = idDokter;
        this.keluhan = keluhan;
    }

    public Pemeriksaan(int idPeriksa, int idPasien, int idDokter, String keluhan, LocalDate tanggalPeriksa) {
        this.idPeriksa = idPeriksa;
        this.idPasien = idPasien;
        this.idDokter = idDokter;
        this.keluhan = keluhan;
        this.tanggalPeriksa = tanggalPeriksa;
    }

    // Getter & Setter
    public int getIdPeriksa() {
        return idPeriksa;
    }

    public void setIdPeriksa(int idPeriksa) {
        this.idPeriksa = idPeriksa;
    }

    public int getIdPasien() {
        return idPasien;
    }

    public void setIdPasien(int idPasien) {
        this.idPasien = idPasien;
    }

    public int getIdDokter() {
        return idDokter;
    }

    public void setIdDokter(int idDokter) {
        this.idDokter = idDokter;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }

    public LocalDate getTanggalPeriksa() {
        return tanggalPeriksa;
    }

    public void setTanggalPeriksa(LocalDate tanggalPeriksa) {
        this.tanggalPeriksa = tanggalPeriksa;
    }
}