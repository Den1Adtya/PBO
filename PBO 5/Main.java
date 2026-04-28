public class Main {
    public static void main(String[] args) {
        BankAccount Deni = new BankAccount(
            1000000,
            "81220624606",
            "Deni");
            Deni.deposit( 5000000);
            Deni.withdraw(500000);
            System.out.println(Deni);
}
}