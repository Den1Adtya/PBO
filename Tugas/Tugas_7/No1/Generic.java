package Tugas_7.No1;

class Mahasiswa<N, A, C> {
    private N nim;
    private A name;
    private C clas;

    public void setNim(N nim) {
        this.nim = nim;
    }

    public void setName(A name) {
        this.name = name;
    }

    public void setClas(C clas) {
        this.clas = clas;
    }

    public N getNim() {
        return nim;
    }

    public A getName() {
        return name;
    }

    public C getClas() {
        return clas;
    }
}