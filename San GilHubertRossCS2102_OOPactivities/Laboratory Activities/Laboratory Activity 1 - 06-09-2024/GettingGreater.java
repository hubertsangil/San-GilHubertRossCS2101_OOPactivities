import java.util.Scanner;

class GettingGreater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Getting the Greater Value");
        System.out.print("Enter first character: ");
        char firstChar = scanner.next().charAt(0);
        
        System.out.print("Enter second character: ");
        char secondChar = scanner.next().charAt(0);
        
        int firstAsciiValue = (int) firstChar;
        int secondAsciiValue = (int) secondChar;
        
        int greaterValueInt = (Math.max(firstAsciiValue, secondAsciiValue));
        
        char greaterValueChar = (char) greaterValueInt;
        
        System.out.println("------------------------------------------");
        System.out.println("The character with greater value is: " + greaterValueChar);
        System.out.println("------------------------------------------");
        
        System.out.println("Showing the ASCII Codes");
        System.out.println(firstChar + " : " + firstAsciiValue);
        System.out.println(secondChar + " : " + secondAsciiValue);
        
        
    }
}