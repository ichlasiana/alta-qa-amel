import java.util.Scanner;

public class faktor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai: ");
        int nilai = input.nextInt();

        for(int faktor = 1; faktor <= nilai; faktor++){
            if(nilai % faktor == 0){
                System.out.println(faktor);
            }
        }

    }
}