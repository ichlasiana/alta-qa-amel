public class Main {
    public static void main(String[] args) {
        Segitiga tiga1 = new Segitiga(3, 4);
        PersegiPanjang pp1 = new PersegiPanjang(7, 8);
        Persegi p1 = new Persegi(4);

        // luas
        System.out.println("Luas");
        System.out.println("Persegi: " + p1.luasPersegi());
        System.out.println("Segitiga: " + tiga1.hitungLuas());
        System.out.println("Persegi Panjang: " + pp1.luasPersegiP());

        // keliling
        System.out.println("Keliling");
        System.out.println("Persegi: "+ p1.kelilingPersegi());
        System.out.println("Segitiga: " + tiga1.hitungKeliling());
        System.out.println("Persegi Panjang: "+ pp1.kelilingPersegiP());


    }
}