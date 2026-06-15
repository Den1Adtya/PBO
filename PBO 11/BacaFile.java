import java.io.*;
import java.util.Scanner;

public class BacaFile {
    public static void main(String[] args) {

        try {
            File f = new File("file.txt");
            Scanner r = new Scanner(f);

            while (r.hasNextLine()) {
                String line = r.nextLine();
                System.out.println(line);
            }

            r.close();
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
            //e.printStackTrace();
        }
    }
}