public class HandPhone {
    String jenis_hp;
    int tahun_pembuatan;

    // PERBAIKAN: ubah "String public" → "public void", tambah "this."
    public void setDataHP(String jenis_hp, int tahun_pembuatan) {
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }

    // PERBAIKAN: tambah "public", tambah "return jenis_hp;"
    public String getJenisHP() {
        return jenis_hp;
    }

    // PERBAIKAN: ubah tipe return ke "int", tambah "return tahun_pembuatan;"
    public int getTahunPembuatan() {
        return tahun_pembuatan;
    }

    public static void main(String[] args) {
        HandPhone hp = new HandPhone();

        // PERBAIKAN: isi argumen dengan nilai langsung (bukan variabel tak terdefinisi)
        hp.setDataHP("Samsung Galaxy", 2023);

        // PERBAIKAN: tambah System.out.println() dan tanda ";"
        System.out.println(hp.getJenisHP());
        System.out.println(hp.getTahunPembuatan());
    }
}
