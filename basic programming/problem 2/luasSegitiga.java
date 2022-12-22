import java.util.Scanner;
public class luasSegitiga {
    public static void main(String[] args) {
        // Luas alas segitiga tanpa inputan

        int alas = 10;
        int tinggi = 10;

        int luasAlas = (alas*tinggi)/2;
        System.out.println(luasAlas);

        // luas alas segitiga dengan inputan

        int alasSegitiga;
        int tinggiSegitiga;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan alas: ");
        alasSegitiga = input.nextInt();
        System.out.println("Masukkan tinggi: ");
        tinggiSegitiga = input.nextInt();

        int luasAlas2 = (alasSegitiga*tinggiSegitiga)/2;
        System.out.println("Hasilnya adalah : " + luasAlas2);

    }
}