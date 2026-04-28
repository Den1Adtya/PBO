package Tugas_7.No3.service;

import java.util.ArrayList;

import Tugas_7.No3.model.PerangkatInput;

// generic + collection
public class PerangkatService<T extends PerangkatInput> {

    private ArrayList<T> list = new ArrayList<>();

    // tambah data
    public void tambah(T data) {
        list.add(data);
    }

    // tampilkan data
    public void tampil() {
        for (T p : list) {
            System.out.println("Nama  : " + p.getNama());
            System.out.println("Merk  : " + p.getMerk());
            System.out.println("Harga : " + p.getHarga());
            if (p instanceof Konektivitas) {
            System.out.println("Wireless: " + ((Konektivitas) p).isWireless());
            }
            p.gunakan();
            System.out.println("----------------------");
        }
    }
}