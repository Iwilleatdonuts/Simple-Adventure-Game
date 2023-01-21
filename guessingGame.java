import java.util.Scanner;
public class guessingGame {
    static void game(double number,int chances, int guess){
        Scanner scanner = new Scanner(System.in);
        chances = 5;
        number = Math.random();
        number = number*100;
        int actualNumber = (int)Math.round(number);
        System.out.println(actualNumber); //remove if actually trying to play the game
        System.out.println("I have chosen a random number between 1 and 99! Can you guess the number below? You have 5 chances!");
        while (chances != 1){
            guess = scanner.nextInt();
        if (guess == actualNumber){
            System.out.println("Wow, you got the number correct! Hacker. >:(");
        } else {
            chances--;
            System.out.println("Nope, that is not the correct number! You have " + chances + " guesses left. Guess again!");
        }
    }
    System.out.println("This is your final guess! Good luck...");
    guess = scanner.nextInt();
    if(guess==actualNumber){
        System.out.println(":o You got the answer on your last try... hacker >:(");
    } else {
    System.out.println("Haha, didn't guess the answer, loser l bozo rip ratio");
    }
    scanner.close();
    }
    public static void main(String[] args) {
        int number=0;
        game(number, 5, 0);    
    }
}
