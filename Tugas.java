
import javax.swing.JOptionPane;

public class Tugas {
    public static void main(String[] args) {
        
        // Menampilkan input dialog
        String pelajaran = JOptionPane.showInputDialog(
                "Anda sedang belajar apa?"
        );
        
        // Menampilkan message dialog
        JOptionPane.showMessageDialog(
                null,
                "Belajar " + pelajaran + " sangat mudah"
        );
    }
}