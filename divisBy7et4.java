import java.util.Scanner;
public class divisBy7et4 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the number below to tell if it is divisible by 4 or 7.");
        int foo = scanner.nextInt();
        if (foo%7 == 0 && foo%4==0) {
            System.out.println("Your number is divisible by both 4 and 7");
     } else if (foo%7==0) {
            System.out.println("Your number is divisible by 7");
     } else if (foo%4==0) {
            System.out.println("Your number is divisible by 4");
     } else {
         System.out.println("Your number is not divisible by 4 or 7");
     }
     scanner.close();
     }
}