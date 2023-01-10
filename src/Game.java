import java.util.Scanner;
public class Game {
    static void action(int numOfRounds, String weapon, String armor) {
        String[] smallEnemies = {"Slime(10 ATK, 50 HP)", "Work(15 ATK, 40 HP", "Birb(20 ATK, 30 HP", "Suicide Bomber(90 ATK, 15 HP"};
        String[] items = {"Stone Sword(20 ATK)", "Iron Sword(30 ATK)", "Titanium Sword(40 ATK)", "Donut Smacker(69 ATK)", "Leather Aromor(15% DEF)", "Bronze Armor(35% DEF)", "Golden Armor(50% DEF)", "Donut Guard(69% DEF)"};
        if (numOfRounds<10){
              int rng = (int)Math.round((Math.random())*100);
              if (rng<10){
                
              }
            System.out.println("You have found a mysterious box! You take a peek inside and find a ");
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
        addSpace(blank);
              System.out.println("You are Timmy, and you embark upon a journey, to recover what you lost.");
              System.out.println("Along your path, there will be many forces at work to stop you from achieving your goal.");
              System.out.println("There are also numerous boons along your path to help you reach your destination.");
              System.out.println("Are you ready to begin your journey?");

    }   
}
