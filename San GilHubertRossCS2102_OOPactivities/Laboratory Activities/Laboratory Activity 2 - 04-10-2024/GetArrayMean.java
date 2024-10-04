import java.util.Scanner;

public class GetArrayMean {
    static void getArrayMean() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter number of elements: ");
            int i = input.nextInt();

            float[]numbers = new float[i];
            float sum = 0.0f, average = 0.0f;
    
            for (int idx = 0; idx < numbers.length; idx++){
                System.out.print("Enter number: ");
                numbers[idx] = input.nextFloat();
            }
    
            for (int idx = 0; idx < numbers.length; idx++){
                sum+=numbers[idx];
                average = sum/numbers.length;
            }
            
            System.out.print("Mean of array is: " + String.format("%.2f", average));

            input.close();
            }
    public static void main(String [] args) {
        getArrayMean();
    }
}