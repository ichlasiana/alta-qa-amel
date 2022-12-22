public class Harga extends Barang {
    double harga;

    public Harga(double panjang, double lebar, double tinggi, double berat) {
        super(panjang, lebar, tinggi, berat);
        this.harga = harga;
    }

    public double hargaKirim() {
        double dimensi = panjang * lebar * tinggi;
        if (dimensi == 50 && berat == 1) {
            harga = 5000;
        } else {
            harga = 5000 * berat;
        }
        return harga;
    }
}