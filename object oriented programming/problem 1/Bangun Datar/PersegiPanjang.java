public class PersegiPanjang {
    int panjang;
    int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int luasPersegiP(){
        return this.panjang*this.lebar;
    }

    public int kelilingPersegiP(){
        return 2*(this.panjang+this.lebar);
    }
}
