import java.util.Scanner;

class Tempconvert {
    public static void main(String[] args) {
        float fahrenheit;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a celsius value: ");
        float celsius = input.nextInt();
        fahrenheit = (celsius * 9/5) + 32;
        System.out.print(String.format("%.2f", celsius) + " Celsius is " + String.format("%.2f", fahrenheit) + " Fahrenheit");
    }
}
