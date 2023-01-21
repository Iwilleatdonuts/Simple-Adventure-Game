import java.util.Scanner;
public class primeNumbersRM {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++){
            while (i>0 && i <= number){
                for (int j = 0; j < i; j++){
                    if (i%j==0){
                        break;
                    }
                }
            }
        }
        scanner.close();
    }
}
