package Tugas_7.No3.model;

import Tugas_7.No3.service.Konektivitas;

public class Gamepad extends PerangkatInput implements Konektivitas {

    private boolean wireless;

    public Gamepad(String nama, String merk, int harga, boolean wireless) {
        super(nama, merk, harga);
        this.wireless = wireless;
    }

    @Override
    public void gunakan() {
        System.out.println("Gamepad " + nama + " digunakan untuk bermain game...");
    }

    @Override
    public boolean isWireless() {
        return wireless;
    }
}
