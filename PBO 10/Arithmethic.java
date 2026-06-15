public class Arithmethic {
    public static void main(String[] args) {
        try {
            int hasil = 10 / 0; // This will throw an ArithmeticException
        } catch (Exception e) {
            System.out.println("Error yang ditemukan: " + e.getMessage());
        } finally {
            System.out.println("Program selesai.");
        }
    }
}
