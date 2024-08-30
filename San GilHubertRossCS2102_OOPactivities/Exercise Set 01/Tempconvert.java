import java.util.Scanner;

class Tempconvert {
    public static void main(String[] args) {
        int fahrenheit;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a celsius value: ");
        int celsius = input.nextInt();
        fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}