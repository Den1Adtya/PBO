import java.io.*;

public class InfoFile {
    public static void main(String[] args) {
        File f = new File("file.txt");
        if (f.exists()) {
            System.out.println("File name: " + f.getName());
            System.out.println("Absolute path: " + f.getAbsolutePath());
            System.out.println("Writable: " + f.canWrite());
            System.out.println("Readable: " + f.canRead());
            System.out.println("File size in bytes: " + f.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
