import java.util.Scanner;
public class factors {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a number below");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if(number%i == 0) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}