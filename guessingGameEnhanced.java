import java.util.Scanner;
public class guessingGameEnhanced {
    static void game(){
        System.out.println("Do you want to play easy mode or hard mode? Type 1 for easy, type 2 for hard.");
        Scanner scanner = new Scanner(System.in);
        int ezhd = scanner.nextInt();
        int chances = 10;
        double number = Math.random();
        number = number*100;
        int actualNumber = (int)Math.round(number);
            System.out.println("I have chosen a random number between 1 and 99! Can you guess the number below? You have "+chances+ " chances!");
        while (chances != 1){
            int guess = scanner.nextInt();
        if (guess == actualNumber){
            System.out.println("Wow, you got the number correct! Hacker. >:(");
            break;
        } else {
            chances--;
            System.out.println("Nope, that is not the correct number! You have " + chances + " guesses left. Guess again!");
            if(ezhd==1){
                if(guess<actualNumber){
                    System.out.println("Hint, your guess is less than the number!");
                } else if(guess>actualNumber){
                    System.out.println("Hint, your guess is greater than the number!");
                }
            }
        }
    }
    if(chances==1){
    System.out.println("This is your final guess! Good luck...");
    int guess = scanner.nextInt();
    if(guess==actualNumber){
        System.out.println(":o You got the answer on your last try... hacker >:(");
    } else {
    System.out.println("Haha, didn't guess the answer, loser l bozo rip ratio");
    System.out.println("BTW, the number was "+actualNumber);
    }
    }
    scanner.close();
    }
        public static void main(String[] args) {
        game();
    }
}
