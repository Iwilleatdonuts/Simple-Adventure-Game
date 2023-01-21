import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class quizEnhanced {
static void createQuiz(int numOfQuestions, String quizName, String name, String blankSpace){
    Scanner scanner = new Scanner(System.in);
    System.out.println("So, now that we have the required information to create your quiz, we shall begin to make the quiz.");
    List<String> questions = new ArrayList<String>();
    List<String> answers = new ArrayList<String>();
    while(questions.size()<numOfQuestions){
    System.out.println("Please type question "+(questions.size()+1)+" of your quiz below.");
    questions.add(scanner.nextLine());
    System.out.println("And now, please type the answer to the question below.");
    answers.add(scanner.nextLine());
        }
        System.out.println(blankSpace);
        System.out.println("Finally. The moment we have been waiting for... it is time to play "+quizName+"!!!");
        int score = 0;
        for(int i = 0;i<questions.size();i++){
            System.out.println("Question "+(i+1)+" is: "+questions.get(i));
            String answer = scanner.nextLine();
            if (answer.equals(answers.get(i))){
                score++;
            }
        }
        System.out.println("Congratulations! You have played "+quizName+", by "+name+". Your final score is "+score+" out of "+numOfQuestions);
        if(score<(numOfQuestions/2)){
            System.out.println("Damn, less than 50%, ur kinda trash ngl");
        } else if(score==numOfQuestions){
            System.out.println(":O You did perfect! Congrats! Tho u didn't get at least 140% like your friend Tommy would have so ur trash l bozo rip ratio");
        }
        scanner.close();
}
    public static void main(String[] args) {
        System.out.println("Welcome to 'Create Your Own Quiz'!!!! To begin, I will need to get some information on your quiz.");
    System.out.println("First off, what is your name?");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    System.out.println(name+", huh? Now then, what is the title of your quiz?");
    String quizName = scanner.nextLine();
    System.out.println("And now, how many questions will "+quizName+" have?");
    int numOfQuestions = scanner.nextInt();
    String blankSpace="        ";
        for(int i=0;i<10;i++){
            System.out.println(blankSpace);
            blankSpace = blankSpace+blankSpace;
        }
    createQuiz(numOfQuestions, quizName, name, blankSpace);
    scanner.close();
    }
}
