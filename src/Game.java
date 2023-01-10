import java.util.Scanner;
public class Game {
    static void action(int numOfRounds, String weapon, String armor) {
        String[] smallEnemies = {"Slime(10 ATK, 50 HP)", "Work(15 ATK, 40 HP", "Birb(20 ATK, 30 HP"};
        String[] mediumEnemies = {"Suicide Bomber(90 ATK, 15 HP)", };
        String[] items = {"Donut(69 Heal)", "Chicken(15 Heal)", "Random Cabbage(5 Heal)", "Stone Sword(20 ATK)", "Iron Sword(30 ATK)", "Titanium Sword(40 ATK)", "Donut Smacker(69 ATK)", "Leather Aromor(15% DEF)", "Bronze Armor(35% DEF)", "Golden Armor(50% DEF)", "Donut Guard(69% DEF)"};
        int randomItem = (int)(Math.random()*items.length);
        int randomSmallEnemy = (int)(Math.random()*smallEnemies.length);
        int randomMediumEnemt = (int)(Math.random()*mediumEnemies.length);
        if (numOfRounds<=3){
            System.out.println("You have found a mysterious box! You take a peek inside and find a "+items[randomItem]);
        } else if (numOfRounds<=9&&numOfRounds>=4){
            
        }
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
        String weapon = "Wooden Sword(10 ATK)";
        String armor = "None";
        addSpace(blank);
              System.out.println("You are Timmy, and you embark upon a journey, to recover what you lost.");
              System.out.println("Along your path, there will be many forces at work to stop you from achieving your goal.");
              System.out.println("There are also numerous boons along your path to help you reach your destination.");
              System.out.println("Are you ready to begin your journey?");
              scanner.nextLine();
        for (int numOfRounds = 0; numOfRounds<100;numOfRounds++){
            action(numOfRounds, weapon, armor);
        }
    }   
}
