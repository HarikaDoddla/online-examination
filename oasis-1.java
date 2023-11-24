import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        String[] questions = {
            "What is the capital of France?\nA. London\nB. Paris\nC. Rome\nYour answer: ",
            "What is the largest mammal?\nA. Elephant\nB. Blue Whale\nC. Lion\nYour answer: ",
            " What is the capital of India?\nA.DELHI\nB.MUMBAI\nc.Gujarat\n.D.ANDHRA PRADESH\n"
            
        };
        
        
        String[] answers = {"B", "B","A"}; 
        
        int score = 0; 
        
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ":");
            System.out.println(questions[i]);
            String userAnswer = scanner.nextLine().toUpperCase(); 
            if (userAnswer.equals(answers[i])) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect!\n");
            }
        }
        
        
        System.out.println("Quiz ended! Your score is: " + score + "/" + questions.length);
        
        scanner.close();
    }
}
