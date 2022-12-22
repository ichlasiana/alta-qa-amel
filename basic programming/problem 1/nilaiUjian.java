import java.util.Scanner;

public class nilaiUjian {
    public static void main(String[] args) {

        int nilaiUjian;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nilai: ");
        nilaiUjian = scanner.nextInt();
        if (nilaiUjian >= 80 && nilaiUjian <= 100) {
            System.out.println("nilainya A");
        } else if (nilaiUjian >= 65 && nilaiUjian <= 79) {
            System.out.println("nilainya B");
        } else if (nilaiUjian >= 50 && nilaiUjian <= 64) {
            System.out.println("nilainya C");
        } else if (nilaiUjian >= 35 && nilaiUjian <= 49) {
            System.out.println("nilainya D");
        } else {
            System.out.println("nilainya E");
        }
    }
}