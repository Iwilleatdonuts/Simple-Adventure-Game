import java.util.Scanner;
public class degreeConverter {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Are you converting from celsius or fahrenheit?");
    System.out.println("Type 1 for celsius to fahrenheit, type 2 for fahrenheit to celsius.");
       int celOrFahr = scanner.nextInt();
     if (celOrFahr == 1) {
        System.out.println("What is the degree in celsius?");
            int celDeg = scanner.nextInt();
            double celToFahr = celDeg * 1.8 + 32;
        System.out.println(celToFahr);
     } else if (celOrFahr == 2) {

        System.out.println("What is the degree in fahrenheit?");
            int fahrDeg = scanner.nextInt();
            double fahrToCel = (fahrDeg - 32) / 1.8;
            System.out.println(fahrToCel + " degree celsius");
     } else {
         System.out.println("That is not what I asked for...");
     }
     scanner.close();
    }
}