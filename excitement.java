import java.util.Scanner;
public class excitement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many layers should this picture have?");
        int layers = scanner.nextInt();
        scanner.close();
        String theRepeated = "!";
        int count = 1;
        do {
        System.out.println(theRepeated);
        theRepeated = theRepeated + "!";
        count++;
         } while (count <= layers);
    }
    
}
