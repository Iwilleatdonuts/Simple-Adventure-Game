import java.util.Scanner;
public class useless {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type any SINGLE DIGIT NATURAL NUMBER in WORD FORM below(no capitals).");
        String number = scanner.nextLine();
        switch(number) {
            case "nine":
                System.out.println("nine, eight, seven, six, five, four, three, two, one");
                break;
            case "eight":
                System.out.println("eight, seven, six, five, four, three, two, one");
                break;
            case "seven":
                System.out.println("seven, six, five, four, three, two, one");
                break;
            case "six":
                System.out.println("six, five, four, three, two, one");
                break;
            case "five":
                System.out.println("five, four, three, two, one");
                break;
            case "four":
                System.out.println("four, three, two, one");
                break;
            case "three":
                System.out.println("three, two, one");
                break;
            case "two":
                System.out.println("two, one");
                break;
            case "one":
                System.out.println("one");
            default:
                System.out.println("Invalid input >:(");
        }
        scanner.close();
    }
}