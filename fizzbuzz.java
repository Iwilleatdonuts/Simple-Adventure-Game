import java.util.Scanner;
public class fizzbuzz {
    static void fizzBuzz(int number) {
        for(int i=1;i<number;i++){
            if(i%5==0 && i%3==0){
                System.out.print("FizzBuzz ");
            } else if(i%5==0){
                System.out.print("Buzz ");
            } else if(i%3==0){
                System.out.print("Fizz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print out a number below");
        int number = scanner.nextInt();
        fizzBuzz(number);
        scanner.close();
    }
}
