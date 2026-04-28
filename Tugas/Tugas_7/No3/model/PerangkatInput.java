package Tugas_7.No3.model;

// abstract class
public abstract class PerangkatInput {
    protected String nama;
    protected String merk;
    protected int harga;

    // constructor
    public PerangkatInput(String nama, String merk, int harga) {
        this.nama = nama;
        this.merk = merk;
        this.harga = harga;
    }

    // abstract method (polymorphism)
    public abstract void gunakan();

    // getter
    public String getNama() {
        return nama;
    }

    public String getMerk() {
        return merk;
    }

    public int getHarga() {
        return harga;
    }
}