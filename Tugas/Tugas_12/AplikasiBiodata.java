import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AplikasiBiodata extends JFrame {
    private JTextField txtNim, txtNama, txtProdi;
    private JTextArea txtOutput;

    public AplikasiBiodata() {
        // Pengaturan Frame Utama
        setTitle("Aplikasi Biodata Mahasiswa");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // 1. Panel Input Data (Garis Biru menggunakan TitledBorder)
        JPanel panelInput = new JPanel(new GridLayout(3, 2, 5, 5));
        TitledBorder borderInput = BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.BLUE), "Input Data");
        panelInput.setBorder(borderInput);

        panelInput.add(new JLabel("NIM"));
        txtNim = new JTextField();
        panelInput.add(txtNim);

        panelInput.add(new JLabel("Nama"));
        txtNama = new JTextField();
        panelInput.add(txtNama);

        panelInput.add(new JLabel("Program Studi"));
        txtProdi = new JTextField();
        panelInput.add(txtProdi);

        // 2. Panel Tombol
        JPanel panelTombol = new JPanel();
        JButton btnTampilkan = new JButton("Tampilkan");
        JButton btnReset = new JButton("Reset");
        panelTombol.add(btnTampilkan);
        panelTombol.add(btnReset);

        // 3. Panel Output (Garis Biru menggunakan TitledBorder)
        JPanel panelOutput = new JPanel(new BorderLayout());
        TitledBorder borderOutput = BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.BLUE), "Output");
        panelOutput.setBorder(borderOutput);

        txtOutput = new JTextArea(8, 20);
        txtOutput.setEditable(false);
        panelOutput.add(new JScrollPane(txtOutput), BorderLayout.CENTER);

        // Menggabungkan Panel ke Frame
        JPanel panelAtas = new JPanel(new BorderLayout());
        panelAtas.add(panelInput, BorderLayout.NORTH);
        panelAtas.add(panelTombol, BorderLayout.CENTER);

        add(panelAtas, BorderLayout.NORTH);
        add(panelOutput, BorderLayout.CENTER);

        // --- Logika Tombol ---

        // Fungsi Tampilkan
        btnTampilkan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String hasil = "========== BIODATA MAHASISWA ==========\n\n" +
                        "NIM            : " + txtNim.getText() + "\n" +
                        "Nama           : " + txtNama.getText() + "\n" +
                        "Program Studi  : " + txtProdi.getText();
                txtOutput.setText(hasil);
            }
        });

        // Fungsi Reset
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNim.setText("");
                txtNama.setText("");
                txtProdi.setText("");
                txtOutput.setText("");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new AplikasiBiodata().setVisible(true);
        });
    }
}
