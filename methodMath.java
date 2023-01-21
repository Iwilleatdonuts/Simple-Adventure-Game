import java.util.Scanner;
public class methodMath {
    static void addition(double number1 , double number2){
        System.out.println(number1 + " + " + number2 + " = " + (number1+number2));
    }
    static void subtraction(double number1, double number2){
        System.out.println(number1 + " - " + number2 + " = " + (number1-number2));
    }
    static void multiplication(double number1, double number2){
        System.out.println(number1 + " x " + number2 + " = " + (number1*number2));
    }
    static void division(double number1, double number2){
        System.out.println(number1 + " / " + number2 + " = " + (number1/number2));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please print out the first number below");
        double number1 = scanner.nextDouble();
        System.out.println("Plase print out the second number below");
        double number2 = scanner.nextDouble();
        addition(number1,number2);
        subtraction(number1,number2);
        multiplication(number1,number2);
        division(number1,number2);
        scanner.close();
    }
}
