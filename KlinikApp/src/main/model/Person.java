package model;

public abstract class Person {

    private String nama;

    public Person() {
    }

    public Person(String nama) {
        this.nama = nama;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method yang wajib diimplementasikan oleh subclass
    public abstract String getInfo();
}