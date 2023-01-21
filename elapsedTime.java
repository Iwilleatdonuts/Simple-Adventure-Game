import java.util.Scanner;
public class elapsedTime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please type in the starting hour.");
        int hour = scanner.nextInt();
            if (hour <=12 && hour >=1) {
                System.out.println("Is the time am or pm?");
                String aPM = scanner2.nextLine();
                    if (aPM.equals("am")) {
                        System.out.println("How many hours have passed since " + hour + "am");
                        int elapsed = scanner.nextInt();
                        int finalTime = elapsed + hour;
                            if (finalTime<=12){
                                System.out.println("The current time is " + finalTime + "am");
                            } else if (finalTime>12 && (finalTime/12)%2==1) {
                                finalTime = finalTime % 12;
                                System.out.println("The current time is " + finalTime + "pm");
                            } else if (finalTime%12 == 0) {
                                finalTime = 12;
                                System.out.println("The current time is " + finalTime + "am");
                            } else {
                                finalTime = finalTime % 12;
                                System.out.println("The current time is " + finalTime + "am");
                            }
                    } else if (aPM.equals("pm")){
                        System.out.println("How many hours have passed since " + hour + "pm");
                        int elapsed = scanner.nextInt();
                        int finalTime = elapsed + hour;
                            if (finalTime<=12){
                                System.out.println("The current time is " + finalTime + "pm");
                            } else if (finalTime>12 && (finalTime/12)%2==1) {
                                finalTime = finalTime%12;
                                System.out.println("The current time is " + finalTime + "am");
                            } else if (finalTime%12 == 0) {
                                finalTime = 12;
                                System.out.println("The current time is " + finalTime + "pm");
                            } else {
                                finalTime = finalTime % 12;
                                System.out.println("The current time is " + finalTime + "pm");
                            }
                    } else {
                        System.out.println("That is not what I asked for.");
                    }
            } else {
                System.out.println("That is not what I asked for.");
            }
            scanner.close();
            scanner2.close();
    }
}