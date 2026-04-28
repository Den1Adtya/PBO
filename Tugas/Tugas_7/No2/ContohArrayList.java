package Tugas_7.No2;
import java.util.ArrayList;
public class ContohArrayList {
    public static void main(String[] args) {
        ArrayList<String> lagu = new ArrayList<>();

        lagu.add("Weird Fishes - Radiohead");
        lagu.add("Black Friday - Tom Odell");
        lagu.add("Creep - Radiohead");

        System.out.println("Daftar lagu favorit:");
        for (String l : lagu) {
            System.out.println(l);
        }
    }
}