public class MultipleCatch {
    public static void main(String[] args) {
        try {
          //  int angka = Integer.parseInt("abc"); // This will throw an ArithmeticException
            int hasil = 10/0;
            int [] data = {1,2,3};
            System.out.println(data[10]);
        } catch (NumberFormatException e) {
            System.out.println("Format angka salah");    // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("tidak bisa dibagi dengan nol");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index array melebihi batas");
        } catch (Exception e) {
            System.out.println("Exception Umum");
        } 
            System.out.println("Program selesai.");
        
    }
}
