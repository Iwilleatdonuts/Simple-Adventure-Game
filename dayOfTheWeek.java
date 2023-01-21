import java.util.Scanner;
public class dayOfTheWeek {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dayOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        boolean done = false;
        do {
            System.out.println("Type in a number and I will tell you what day of the week corresponds to that number...");
            int numberDay = scanner.nextInt() - 1;
            if(numberDay <= 6 && numberDay>=1){
            System.out.println("The day of the week that corresponds to your number is "+ dayOfTheWeek[numberDay]);
            done = true;
            } 
        } while (done == false);
        scanner.close();
    }
}
