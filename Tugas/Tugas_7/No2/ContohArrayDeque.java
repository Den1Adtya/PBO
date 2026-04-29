package Tugas_7.No2;
import java.util.ArrayDeque;

public class ContohArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String> tumpukan = new ArrayDeque<>();

        tumpukan.add("Buku 1");
        tumpukan.add("Buku 2");
        tumpukan.add("Buku 3");

        System.out.println("tumpukan awal: " + tumpukan);

        tumpukan.poll(); 
        System.out.println("Setelah diambil: " + tumpukan);
        //Deni Aditya Saputra
        tumpukan.addFirst("Buku 4");
        System.out.println("Tambah buku: " + tumpukan);
    }
}