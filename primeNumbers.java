import java.util.Scanner;
public class primeNumbers {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a number below");
        int number = scanner.nextInt();
        for (int i = 1; i<number;i++){
            int test = 1;
            int factors = 0;
            while (test<=i){
              if (i%test == 0){
                factors++;
               }
            test++;
              }
              if (factors == 2){
                System.out.print(i + " ");
             }
        }
        scanner.close();
    }
}