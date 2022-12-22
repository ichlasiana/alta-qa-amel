public class Main {
    public static void main(String[] args) {
        Operasi opr = new Operasi();

        opr.setAngka(3,4);
        System.out.println("Penjumlahan : "+opr.tambah());

        opr.setAngka(15,4);
        System.out.println("Penjumlahan : "+opr.kurang());

        opr.setAngka(10,10);
        System.out.println("Perkalian : "+opr.kali());

        opr.setAngka(12,3);
        System.out.println("Pembagian : "+opr.bagi());
    }
}