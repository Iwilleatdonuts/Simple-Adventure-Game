import java.util.Scanner;

import javax.xml.stream.util.StreamReaderDelegate;
public class Game {
    static void action(int numOfRounds, String weapon, String armor, Scanner scanner) {
        String[] smallEnemies;
        if(numOfRounds<=20){
            smallEnemies = new String[]{"a Slime(10 ATK, 50 HP)", "a Worm(15 ATK, 40 HP)", "a Birb(20 ATK, 30 HP)"};
            int[] smallEnemiesATK = {10, 15, 20};
            int[] smallEnemiesHP = {50, 40, 30};
        } else if(numOfRounds>=21&&numOfRounds<=40){
            smallEnemies = new String[]{"a Slime(12 ATK, 55 HP)", "a Worm(18 ATK, 44 HP)", "a Birb(24 ATK, 33 HP)"};
            int[] smallEnemiesATK = {12, 18, 24};
            int[] smallEnemiesHP = {55, 44, 33};
        } else if(numOfRounds>=41&&numOfRounds<=60){
            smallEnemies = new String[]{"a Slime(15 ATK, 60 HP)", "a Worm(21 ATK, 50 HP)", "a Birb(30 ATK, 40 HP)"};
            int[] smallEnemiesATK = {15, 21, 30};
            int[] smallEnemiesHP = {60, 50, 40};
        } else {
            smallEnemies = new String[]{"a Slime(20 ATK, 100 HP)", "a Worm(30 ATK, 80 HP)", "a Birb(40 ATK, 100 HP)"};
            int[] smallEnemiesATK = {20, 30, 40};
            int[] smallEnemiesHP = {100, 80, 60};
        }
        int largeFuckingWormATK = 40;
        int largeFuckingWormHP = 100;
        String[] items = {"a Donut(69 Heal)", "a Chicken(15 Heal)", "a Random Cabbage(5 Heal)", "a Stone Sword(20 ATK)", "an Iron Sword(30 ATK)", "a Titanium Sword(40 ATK)", "a Donut Smacker(69 ATK)", "a Leather Aromor(15 DEF)", "a Bronze Armor(35 DEF)", "a Golden Armor(50 DEF)", "a Donut Guard(69 DEF)"};
        int randomItem = (int)(Math.random()*items.length);
        int rng = (int)(Math.random()*100);
        int randomSmallEnemy = (int)(Math.random()*smallEnemies.length);
        if (numOfRounds<=3){
            System.out.println("You have found a mysterious box! You take a peek inside and find "+items[randomItem]);
        } else if (numOfRounds<=9&&numOfRounds>=4){
            if (rng>=70){
                System.out.println("You have found a mysterious box! You take a peek inside and find "+items[randomItem]);
            } else if (rng<=69){
                System.out.println("Your path has been blocked by "+smallEnemies[randomSmallEnemy]);
            }
        } else if (numOfRounds==10){
            System.out.println("You are on wave 10! You path is blocked by your first boss, a Large Fucking Worm.");
        } else if (numOfRounds>=11&&numOfRounds<=24){
            if (rng>=80){
                System.out.println("You have found a mysterious box! You take a peek inside and find "+items[randomItem]);
            } else if (rng<=79){
                System.out.println("Your path has been blocked by "+smallEnemies[randomSmallEnemy]);
            }
        }
        System.out.println("You have now completed "+numOfRounds+" out of 100 rounds. Ready to continue?");
        scanner.nextLine();
    }
    static void addSpace(String blank){
        for(int i = 0; i < 20; i++){
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
              addSpace(blank);
        for (int numOfRounds = 1; numOfRounds<100;numOfRounds++){
            action(numOfRounds, weapon, armor, scanner);
            addSpace(blank);
        }
    }   
}
