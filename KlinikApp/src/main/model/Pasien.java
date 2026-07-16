package model;

public class Pasien extends Person {

    private int idPasien;
    private int umur;
    private String alamat;

    public Pasien() {
        super();
    }

    public Pasien(String nama, int umur, String alamat) {
        super(nama);
        this.umur = umur;
        this.alamat = alamat;
    }

    public Pasien(int idPasien, String nama, int umur, String alamat) {
        super(nama);
        this.idPasien = idPasien;
        this.umur = umur;
        this.alamat = alamat;
    }

    // Getter & Setter
    public int getIdPasien() {
        return idPasien;
    }

    public void setIdPasien(int idPasien) {
        this.idPasien = idPasien;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public String getInfo() {
        return "Pasien: " + getNama() + " | Umur: " + umur + " | Alamat: " + alamat;
    }
}