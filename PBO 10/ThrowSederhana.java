public class ThrowSederhana {
    public static void main(String[] args) {
        int umur = 17;
        if (umur < 18) {
            throw new ArithmeticException("Umur harus 18 tahun atau lebih");
        } else {
            System.out.println("Selamat datang!");
        }
    }
}
