import java.util.Scanner;
public class Game {
    static void action(boolean inBattle, boolean injured, int numberOfItems) {
        System.out.println("If you want to perform one of these actions, type the keyword next to the listed action");
        System.out.println(" -Move from your current location to the next point of the journey: Move");
        System.out.println(" -Dig the area below you to see what you can find: Dig");
        System.out.println(" -Attack mob(if there is a mob): Attack");
    }
    static void addSpace(String blank){
        for(int i = 0; i < 30; i++){
            blank = "          ";
            blank = blank+blank;
            System.out.println(blank);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String blank= "whatever";
        addSpace(blank);
              System.out.println("You are Timmy, and you embark upon a journey, to recover what you lost.");
              System.out.println("Along your path, there will be many forces at work to stop you from achieving your goal.");
              System.out.println("There are also numerous boons along your path to help you reach your destination.");
              System.out.println("Are you ready to begin your journey?");

    }   
}
