public class Main {
    public static void main(String[] args) {
        Kubus kbs = new Kubus(10);
        System.out.println("Hasil volume segitiga: " + kbs.volumeKubus());


        Balok blk = new Balok(3,6,10);
        System.out.println();
        System.out.println("Hasil volume balok: " + blk.volumeBalok());


        Tabung tbg = new Tabung(7,10);
        System.out.println();
        System.out.println("Hasil volume tabung: " + tbg.volumeTabung());

    }
}