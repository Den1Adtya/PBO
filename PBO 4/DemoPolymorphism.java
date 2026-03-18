//Super class
class produk{
    protected String nama;
    protected int harga;

    public produk(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }
    public String tampilInfo() {
        return "[UMUM]" + nama + "| harga" + harga;
    }
}

// SUB CLASS 1
class produkFisik extends produk{
    private double beratKg;

    public produkFisik (String nama, int harga, Double beratKg) {
        super (nama, harga);
        this.beratKg = beratKg;
    }
    @Override//Overriding
    public String tampilInfo(){
        return "[FISIK]" + nama + "| harga:" + harga + "| Berat:"+ beratKg+"kg"; 
    }
}

//SUBLASS 2
class produkDigital extends produk{
    private String masaAktif;
    
    public produkDigital (String nama, int harga, String masaAktif){
        super(nama, harga);
        this.masaAktif = masaAktif;
    }

    @Override
    public String tampilInfo(){
        return "[DIGITAL]"+ nama+ "| Harga:" + harga + "| MAsa Aktif:" + masaAktif;
    }
}

//Class kasir
class Kasir{
    //overloas 1 tanpa diskon 
    public int hitungBayar (int harga, int qty){
        return harga * qty;
    }

    //Overlload 2 dengan diskon
    public int hitungBayar(int harga , int qty, double diskonPersen){
        int total = harga * qty;
        return (int) (total - (total * diskonPersen/100));
    }
}

// Program utama
public class DemoPolymorphism {
    public static void main(String[] args) {
        System.out.println("=== Demo Overriding ===");
        System.out.println("Memanggil tampilInfo() dari masing-masing objek:\n");
        
        produk P1 = new produk("Kaos Polos", 85000);
        produkFisik P2 = new produkFisik("Sepatu Lari", 350000, 0.8);
        produkDigital P3 = new produkDigital("Microsoft 365", 600000, "1 Tahun");

        System.out.println((P1.tampilInfo()));
        System.out.println((P2.tampilInfo()));
        System.out.println((P3.tampilInfo()));

        System.out.println("\n=== Demo Overloading ===");
        System.out.println("Memanggil hitung bayar() dengan argumwn berberbeda:\n");

        Kasir kasir = new Kasir();

        int total1 = kasir.hitungBayar(50000, 2);
        int total2 = kasir.hitungBayar(50000, 2, 15);

        System.out.println("hitung Bayar(50000, 2)   = " + total1);
        System.out.println("hitung Bayar(50000, 2, 15)   = " + total2);
    }
    
}
