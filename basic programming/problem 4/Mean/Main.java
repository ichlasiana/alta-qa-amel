public class Main {
    private static float Mean(float[] numbers){
        float sum = 0;

        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
        }
        float average = sum / numbers.length;
        return average;

    }
    public static void main(String[] args) {
        float[] value = {1, 2,3, 4};
        System.out.println(Mean(value));
    }
}