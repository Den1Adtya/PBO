class Tabungan {
    public double saldo;

    void tambah(double jumlah){
        saldo += jumlah;
    }

    void ambil(double jumlah){
        saldo -= jumlah;
    }
    void infoSaldo() {
        System.out.println("Saldo : Rp." + saldo);
    }
    public class Contoh {
        public static void main(String[] args){
            Tabungan Deni = new Tabungan();
        }
    }
}

public class contoh {
    public static void main(String[] args){
        Tabungan Deni = new Tabungan ();
          //  Deni.saldo(-1000000);
            Deni.tambah(1000000);
            Deni.ambil(50000);
            Deni.infoSaldo();
}
}