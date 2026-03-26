// Superclass Overloading
class Bank {
    
    public void transferUang(int jumlah, String rekeningTujuan) {
        System.out.println("Transfer sebesar Rp" + jumlah + " ke rekening " + rekeningTujuan);
    }

    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Transfer antar bank sebesar Rp" + jumlah + " ke rekening " + rekeningTujuan + " di bank " + bankTujuan);
    }

    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan, String berita) {
        System.out.println("Transfer sebesar Rp" + jumlah + " ke rekening " + rekeningTujuan + " di bank " + bankTujuan);
        System.out.println("Berita: " + berita);
    }

    public void sukuBunga() {
        System.out.println("Suku Bunga standar adalah 3%");
    }
}

// Subclass BankBNI Overriding
class BankBNI extends Bank {
    
    @Override
    public void sukuBunga() {
        System.out.println("Suku Bunga dari BNI adalah : 4%");
    }

    @Override
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        bankTujuan = "BNI";
        System.out.println("Transfer khusus dari BNI sebesar Rp" + jumlah + " ke rekening " + rekeningTujuan + " dengan tujuan akhir otomatis ke Bank " + bankTujuan);
    }
}

// Subclass BankBCA Overriding
class BankBCA extends Bank {
    
    @Override
    public void sukuBunga() {
        System.out.println("Suku Bunga dari BCA adalah : 4.5%");
    }

    @Override
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        bankTujuan = "BCA";
        System.out.println("Transfer khusus dari BCA sebesar Rp" + jumlah + " ke rekening " + rekeningTujuan + " dengan tujuan akhir otomatis ke Bank " + bankTujuan);
    }
}

// Program Utama
public class MainBank {
    public static void main(String[] args) {
        System.out.println("=== PENGUJIAN CLASS BANK (OVERLOADING) ===");
        Bank bankUmum = new Bank();
        bankUmum.sukuBunga();
        bankUmum.transferUang(500000, "1234567890");
        bankUmum.transferUang(1000000, "0987654321", "Mandiri");
        bankUmum.transferUang(250000, "1122334455", "BRI", "Pembayaran ukt bulan Maret");

        System.out.println("\n=== PENGUJIAN CLASS BANK BNI (OVERRIDING) ===");
        BankBNI bni = new BankBNI();
        bni.sukuBunga();
        // ("Mandiri") akan di-override menjadi "BNI" di dalam method
        bni.transferUang(750000, "9988776655", "Mandiri"); 
        
        System.out.println("\n=== PENGUJIAN CLASS BANK BCA (OVERRIDING) ===");
        BankBCA bca = new BankBCA();
        bca.sukuBunga();
        // ("BRI") akan di-override menjadi "BCA" di dalam method
        bca.transferUang(1500000, "5544332211", "BRI"); 
    }
}