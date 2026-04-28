package Tugas_7.No3.model;

import Tugas_7.No3.service.Konektivitas;

public class Mouse extends PerangkatInput implements Konektivitas {

    private boolean wireless;

    public Mouse(String nama, String merk, int harga, boolean wireless) {
        super(nama, merk, harga);
        this.wireless = wireless;
    }

    @Override
    public void gunakan() {
        System.out.println("Mouse " + nama + " digunakan untuk menggerakkan kursor...");
    }

    @Override
    public boolean isWireless() {
        return wireless;
    }
}