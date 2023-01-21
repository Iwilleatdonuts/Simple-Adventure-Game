import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class testLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfQuestions = 2;
        int score = 0;
        System.out.println("So, now that we have the required information to create your quiz, we shall begin.");
List<String> questions = new ArrayList<String>();
List<String> answers = new ArrayList<String>();
while(answers.size()<numOfQuestions){
System.out.println("Please type question "+(questions.size()+1)+" of your quiz below.");
questions.add(scanner.nextLine());
System.out.println("And now, please type the answer to the question below.");
answers.add(scanner.nextLine());
    }
    System.out.println("Finally. The moment we have been waiting for... it is time to play your quiz!!!");
score = 0;
for(int i = 0;i<questions.size();i++){
    System.out.println("Question "+questions.get(i)+" is: "+questions.get(i));
    String answer = scanner.nextLine();
    if (answer.equals(answers.get(i))){
        score++;
    }
}
System.out.println("Your score is "+score+" out of "+numOfQuestions);
scanner.close();
}
}
