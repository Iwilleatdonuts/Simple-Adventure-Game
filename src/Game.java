import java.util.Scanner;

import javax.xml.stream.util.StreamReaderDelegate;
public class Game {
    static void action(int numOfRounds, String weapon, String armor, Scanner scanner) {
        String[] smallEnemies = {"a Slime(30 ATK, 140 HP)", "a Worm(50 ATK, 100 HP)", "a Birb(50 ATK, 80 HP)"};
        int[] smallEnemiesATK = {30, 50, 50};
        int[] smallEnemiesHP = {140, 100, 80};
        String[] bosses = {"a Large Fucking Work(40 ATK, 100 HP)", "an Extremely Fat Squirrel(60 ATK, 140 HP)", "a Pedophilic Chef(75 ATK, 160 HP)", "The Donut Maker(100 ATK, 200 HP)"};
        int[] bossesATK = {40, 60, 75, 100, 1000};
        int[] bossesHP = {100, 140, 160, 200, 69};
        String[] items = {"a Donut(69 Heal)", "a Chicken(15 Heal)", "a Random Cabbage(5 Heal)", "a Stone Sword(20 ATK)", "an Iron Sword(30 ATK)", "a Titanium Sword(40 ATK)", "a Donut Smacker(69 ATK)", "a Leather Aromor(15 DEF)", "a Bronze Armor(35 DEF)", "a Golden Armor(50 DEF)", "a Donut Guard(69 DEF)"};
        int randomItem = (int)(Math.random()*items.length);
        int rng = (int)(Math.random()*100);
        int randomSmallEnemy = (int)(Math.random()*smallEnemies.length);
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
            } else if (numOfRounds>=61&&numOfRounds<=94){
                smallEnemies = new String[]{"a Slime(20 ATK, 100 HP)", "a Worm(30 ATK, 80 HP)", "a Birb(40 ATK, 60 HP)"};
                int[] smallEnemiesATK = {20, 30, 40};
                int[] smallEnemiesHP = {100, 80, 60};
            } else if (numOfRounds>=95&&numOfRounds<=100){
                smallEnemies = new String[]{"a Slime(30 ATK, 130 HP)", "a Worm(40 ATK, 100 HP)", "a Birb(50 ATK, 80 HP)"};
                int[] smallEnemiesATK = {30, 40, 50};
                int[] smallEnemiesHP = {130, 100, 80};
            }
        if (numOfRounds<=3){
            System.out.println("You have found a mysterious box! You take a peek inside and find "+items[randomItem]);
        } else if (numOfRounds<=9&&numOfRounds>=4){
            if (rng>=70){
                System.out.println("You have found a mysterious box! You take a peek inside and find "+items[randomItem]);
            } else if (rng<=69){
                System.out.println("Your path has been blocked by "+smallEnemies[randomSmallEnemy]);
            }
        } else if (numOfRounds==10){
            System.out.println("You are on wave 10! Your path is blocked by your first boss, a Large Fucking Worm(40 ATK, 100 HP).");
        } else if (numOfRounds>=11&&numOfRounds<=24){
            if (rng>=80){
                System.out.println("You have found a mysterious box! You take a peek inside and find "+items[randomItem]);
            } else if (rng<=79){
                System.out.println("Your path has been blocked by "+smallEnemies[randomSmallEnemy]);
            }
        } else if (numOfRounds==25){
                System.out.println("You are on wave 25! Your path has been blocked by a boss, an Extremely Fat Squirrel(60 ATK, 140 HP).");
        } else if (numOfRounds>=26&&numOfRounds<=49){
            if (rng>=86){
                System.out.println("You have found a mysterious box! You take a peek inside and find "+items[randomItem]);
            } else if (rng<=85){
                System.out.println("Your path has been blocked by "+smallEnemies[randomSmallEnemy]);
            }
        } else if (numOfRounds==50){
                System.out.println("You are on wave 50! Your path has been blocked by a boss, a Pedophilic Chef(75 ATK, 160 HP");
        } else if (numOfRounds>=51&&numOfRounds<=74){
            if (rng>=90){
                System.out.println("You have found a mysterious box! You take a peek inside and find "+items[randomItem]);
            } else if (rng<=89){
                System.out.println("Your path has been blocked by "+smallEnemies[randomSmallEnemy]);
            }
        } else if (numOfRounds == 75){
                System.out.println("You are on wave 75! Here, you face your first Spooky Boss, The Donut Maker(100 ATK, 200 HP!");
        } else if (numOfRounds>=76&&numOfRounds<=89){
            if (rng>=95){
                System.out.println("You have found a mysterious box! You take a peek inside and find "+items[randomItem]);
            } else if (rng<=94){
                System.out.println("Your path has been blocked by "+smallEnemies[randomSmallEnemy]);
            }
        } else if (numOfRounds==90){
               System.out.println("You are on wave 90! Your path has been blocked by a Spooky Boss, a Large Suicide Bomber(1000 ATK, 69 HP");
        } else if (numOfRounds>=91&&numOfRounds<=94){
              System.out.println("Your path has been blocked by "+smallEnemies[randomSmallEnemy]);
        } else if (numOfRounds>=95&&numOfRounds<=98){
              System.out.println("Your path has been blocked by "+smallEnemies[randomSmallEnemy]);  
        }
        System.out.println("You have now completed "+numOfRounds+" out of 100 rounds. Ready to continue?");
        String foo = scanner.nextLine();
        
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
