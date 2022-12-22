public class Main {
    private static void drawXYZ(int n){
        int counter =1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<n;j++){
                if(counter%3==0){
                    System.out.print("X");
                }else{
                    if(counter%2==0){
                        System.out.print("Z");
                    }else{
                        System.out.print("Y");
                    }
                }
                counter++;
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        drawXYZ(3);
        drawXYZ(5);
        drawXYZ(1);
    }
}