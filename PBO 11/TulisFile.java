import java.io.*;

public class TulisFile {
    public static void main(String[] args) {
        try {
            FileWriter r = new FileWriter("file.txt");
            r.write("HIDUP JOKOWI");
            r.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            System.out.println(e.getMessage());
        }
    }
}
