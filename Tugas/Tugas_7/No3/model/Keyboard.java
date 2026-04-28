package Tugas_7.No3.model;

import Tugas_7.No3.service.Konektivitas;

// inheritance + interface
public class Keyboard extends PerangkatInput implements Konektivitas {

    private String jenisSwitch;
    private boolean wireless;

    public Keyboard(String nama, String merk, int harga, String jenisSwitch, boolean wireless) {
        super(nama, merk, harga);
        this.jenisSwitch = jenisSwitch;
        this.wireless = wireless;
    }

    @Override
    public void gunakan() {
        System.out.println("Keyboard " + nama + " digunakan untuk mengetik...");
    }

    @Override
    public boolean isWireless() {
        return wireless;
    }
}