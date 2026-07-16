package model;

public class Dokter extends Person {

    private int idDokter;
    private String spesialis;

    public Dokter() {
        super();
    }

    public Dokter(String nama, String spesialis) {
        super(nama);
        this.spesialis = spesialis;
    }

    public Dokter(int idDokter, String nama, String spesialis) {
        super(nama);
        this.idDokter = idDokter;
        this.spesialis = spesialis;
    }

    // Getter & Setter
    public int getIdDokter() {
        return idDokter;
    }

    public void setIdDokter(int idDokter) {
        this.idDokter = idDokter;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }

    @Override
    public String getInfo() {
        return "Dokter: " + getNama() + " | Spesialis: " + spesialis;
    }
}