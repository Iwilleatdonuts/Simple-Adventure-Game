import java.util.Scanner;

public class NewGame{
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
        //this method cotains the data of the items in the game
    static void items(){

    }
        //this method contains the data and attack code for the game
    static void fight(){

        
    }
        //this method acts as the rng for the game to run
    static boolean rng(double chance){
        chance = (1/chance);
        boolean chanced = false;
        if(Math.random()<chance){
            chanced = true;
        }
        return chanced;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int numOfRounds = 1; numOfRounds<=100;numOfRounds++){
            String phase = gamePhase(numOfRounds);
            if(phase.equals("GameIntro")){

            }
            scanner.nextLine();
        }
    }
}