import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to the Quiz Game ===\n");

        // Question 1
        System.out.println("Q1: What is the capital of France?");
        System.out.println("A. Berlin");
        System.out.println("B. Madrid");
        System.out.println("C. Paris");
        System.out.println("D. Rome");
        System.out.print("Your answer: ");
        String answer1 = scanner.nextLine();

        if (answer1.equalsIgnoreCase("C")) {
            System.out.println("Correct!\n");
        } else {
            System.out.println("Wrong! The correct answer is C. Paris\n");
        }

        // TODO: Add more questions later
        System.out.println("More questions coming soon...");
        System.out.println("Thanks for playing!");

        scanner.close();
    }
}
