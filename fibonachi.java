import java.util.Scanner;
public class fibonachi {
    
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int first = 0;
    int second = 1;
    int print = first + second;
    int count = 2;
    System.out.println("How many numbers should the fibonacci sequence print out?");
    int numbers = scanner.nextInt();
    System.out.println(first);
    System.out.println(second);
    while (count < numbers){
        System.out.println(print);
        first = second;
        second = print;
        print = first + second;
        count++;
    }
    scanner.close();
    }
}
