import java.util.Scanner;
public class Game{
        static int playerHP = 100;
        static int playerDEF = 0;
        static int playerATK = 10;
        //this method adds space between text so it's ezier to read
    static void addSpace(String blank){
        for(int i = 0; i < 20; i++){
            blank = "          ";
            blank = blank+blank;
            System.out.println(blank);
        } 
    }
        //this method will determine if a number is between another two numbers
    static boolean between(int num1, int num2, int numOfRounds){
        boolean isBetween = false;
        if (numOfRounds>=num1&&numOfRounds<=num2){
            isBetween = true;
        }
        return isBetween;
    }
        //this method will return the different phases of the game
    static String gamePhase(int numOfRounds){
        String phase;
        if(between(1, 3, numOfRounds)){
            phase = "GameIntro";
        } else if(between(4, 9, numOfRounds)){
            phase = "EnemiesTresWeak";
        } else if(numOfRounds==10){
            phase = "FirstBossFight";
        } else if(between(11, 24, numOfRounds)){
            phase = "EnemiesWeak";
        } else if(numOfRounds==25){
            phase = "SecondBossFight";
        } else if(between(26, 39, numOfRounds)){
            phase = "EnemiesNormal";
        } else if(numOfRounds==40){
            phase = "ThirdBossFight";
        } else if(between(41, 49, numOfRounds)){
            phase = "EnemiesStrongerNormal";
        } else if(numOfRounds==50){
            phase = "FourthBossFight";
        } else if(between(51, 68, numOfRounds)){
            phase = "EnemiesStrong";
        } else if(numOfRounds==69){
            phase = "69BOSSFIGHTLEZGO";
        } else if(numOfRounds==70){
            phase = "SixthBossFight";
        } else if(between(71, 79, numOfRounds)){
            phase = "EnemiesTresStrong";
        } else if(numOfRounds==80){
            phase = "SeventhBossFight";
        } else if(between(81, 89, numOfRounds)){
            phase = "EnemiesTresTresStrong";
        } else if(numOfRounds==90){
            phase = "EightBossFight";
        } else if(between(91, 94, numOfRounds)){
            phase = "EnemiesSaitamaLevel";
        } else if(between(95, 99, numOfRounds)){
            phase = "BossRevenging";
        } else if(numOfRounds==100){
            phase = "FinalBoss";
        } else {
            phase = "error XDiasoxfdodisnsio";
        }
        return phase;
    }
        //this method acts as the rng for the game to run
    static boolean rng(double numerator, double denominator){
        double chance = (numerator/denominator);
        boolean chanced = false;
        if(Math.random()<chance){
            chanced = true;
        }
        return chanced;
    }
        //this method cotains the data of the items in the game
    static void items(Scanner scanner){
        String[] food = {"a Random Cabbage(5 Heal)", "a Chicken(15 Heal)", "a Donut(69 Heal)"};
        String[] weapons = {"a Stone Sword(20 ATK)", "an Iron Sword(30 ATK)", "a Titanium Sword(40 ATK)", "a Donut Smacker(69 ATK)"};
        String[] armor = {"Leather Aromor(15 DEF)", "Bronze Armor(35 DEF)", "Golden Armor(50 DEF)", "Donut Guard(69 DEF)"};
        int[] foodHeal = {5, 15, 69};
        int[] weaponsATK = {20, 30, 40, 69};
        int[] armorDEF = {15, 35, 50, 69};
        int randomFood = (int)(Math.random()*food.length);
        int randomWeapon = (int)(Math.random()*weapons.length);
        int randomArmor = (int)(Math.random()*armor.length);
        if(rng(1,5)){
            System.out.println("You have found "+food[randomFood]+". Would you like to eat it? Type 'yes' or 'no'");
            if (scanner.nextLine().equals("yes")){
                playerHP = playerHP+foodHeal[randomFood];
                if (playerHP>100){
                    playerHP = 100;
                }
            }
            System.out.println("You now have "+playerHP+" health.");
        } else if(rng(1, 2)){
            System.out.println("You have found "+armor[randomArmor]+". Would you like to equip it? Type 'yes' or 'no'");
            if (scanner.nextLine().equals("yes")){
                playerDEF = armorDEF[randomArmor];
            }
            System.out.println("You now have "+playerDEF+" defence.");
        } else {
            System.out.println("You have found "+weapons[randomWeapon]+". Would you like to equip it? Type 'yes' or 'no'");
            if (scanner.nextLine().equals("yes")){
                playerATK = weaponsATK[randomWeapon];
            }
            System.out.println("You now have "+playerATK+" attack.");
        }
        
    }
        //this method contains the data and attack code for the game
    static void fight(){

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String blank = "Whateverfdsiof ao";
        for (int numOfRounds = 1; numOfRounds<=100;numOfRounds++){
            String phase = gamePhase(numOfRounds);
            addSpace(blank);
            System.out.println("You are on round "+numOfRounds);
            switch(phase){
                case "GameIntro":
                    items(scanner);
                break;
                case "EnemiesTresWeak":
                    if(rng(4, 5)){
                        fight();
                    } else {
                        items(scanner);
                    }
                default:
                System.out.println("something broke and it's not my fault >:(");
            }
            scanner.nextLine();
        }
    }
}