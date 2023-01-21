import java.util.Scanner;
public class quiz {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int quizScore = 0;
        System.out.println("This is a true or false quiz based on random facts of the world! Ready??!");
            scanner.nextLine();
        System.out.println("Alrighty then! There are five questions in this quiz and more than 50% is a passing grade! Let's get started. The earth... is flat!! True or false?? (no capitals)");
            String question = scanner.nextLine();
            if (question.equals("false")) {
               quizScore ++;
             }
        System.out.println("Alrighty tighty then... Onwards! The sky is not red, but blue!");
            String questionTwo = scanner.nextLine();
            if (questionTwo.equals("true")) {
                quizScore ++;
            }
        System.out.println("Onto the third question... tomatoes are fruits, true or false?");
            String questionThree = scanner.nextLine();
            if (questionThree.equals("true")) {
                quizScore ++;
            }
        System.out.println("And now, the fourth question. Pizza comes from Russia, true or false?");
            String questionFour = scanner.nextLine();
            if (questionFour.equals("false")) {
                quizScore ++;
            }
        System.out.println("And now... the final question! This one is fairly obvious but... Tommy is better than you at everything. True... or false? >:) >:)");
            String questionFive = scanner.nextLine();
            if (questionFive.equals("true")) {
                quizScore ++;
            }
        System.out.println("Alrighto then, congratulations on finishing the quiz! Your resulats are...");
        if (quizScore == 5) {
            System.out.print(" PERFECTION! My friend, you have completed this test with a perfect five out of five. Great job!");
        } else if (quizScore == 4) {
            System.out.print(" nearly perfect! You did great with an 80% score, but you got one question wrong.");
        } else if (quizScore == 3) {
            System.out.print(" 3 out of 5 questions correct. You just barely passed.");
        } else if (quizScore == 2) {
            System.out.print(" 40%. You failed. How? Why?");
        } else if (quizScore == 1) {
            System.out.print(" horrible... 1 out of 5... how do you manage to get only 1 out of 5? Pathetic...");
        } else {
            System.out.println(" zero. You got every single question wrong. l bozo rip ratiod XDXDXDXD");
        }
        scanner.close();
    }
}
