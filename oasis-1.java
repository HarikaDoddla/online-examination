import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

class OnlineExam {
    private Map<String, String> questions;

    public OnlineExam() {
        questions = new HashMap<>();
        questions.put("Who designed Indian flag?", "Pingali venkayya");
        questions.put("Which is knowns as blue planet?", "Mars");
    }

    public void startExam() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Online Examination!");
        for (Map.Entry<String, String> entry : questions.entrySet()) {
            System.out.println(entry.getKey());
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim();

            if (userAnswer.equalsIgnoreCase(entry.getValue())) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
        }

        System.out.println("\nExam completed! Your score: " + score + "/" + questions.size());
    }
}

public class Main {
    public static void main(String[] args) {
        Map<String, User> users = new HashMap<>();
        users.put("user1", new User("user1", "password1"));
        users.put("user2", new User("user2", "password2"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Login\n2. logout");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter username: ");
                String username = scanner.next();
                System.out.print("Enter password: ");
                String password = scanner.next();

                User currentUser = users.get(username);

                if (currentUser != null && currentUser.getPassword().equals(password)) {
                    System.out.println("\nLogin successful. Welcome, " + username + "!");
                    OnlineExam exam = new OnlineExam();
                    exam.startExam();
                } else {
                    System.out.println("Login failed. Please check your credentials.");
                }
            } else if (choice == 2) {
                System.out.println("Quitting...");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}
