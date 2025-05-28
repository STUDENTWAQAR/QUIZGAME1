// import java.util.Scanner;

// public class QuizGame {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("=== Welcome to the Quiz Game ===\n");

//         // Question 1
//         System.out.println("Q1: What is the capital of France?");
//         System.out.println("A. Berlin");
//         System.out.println("B. Madrid");
//         System.out.println("C. Paris");
//         System.out.println("D. Rome");
//         System.out.print("Your answer: ");
//         String answer1 = scanner.nextLine();

//         if (answer1.equalsIgnoreCase("C")) {
//             System.out.println("Correct!\n");
//         } else {
//             System.out.println("Wrong! The correct answer is C. Paris\n");
//         }

//         // TODO: Add more questions later
//         System.out.println("More questions coming soon...");
//         System.out.println("Thanks for playing!");

//         scanner.close();
//     }
// }
                              // GUI JAVA 
import javax.swing.*;
import java.awt.*;

public class QuizGame{
    JFrame frame;
    JLabel questionLabel, resultLabel;
    JRadioButton optA, optB, optC, optD;
    JButton nextButton;
    ButtonGroup group;

    // Questions and answers
    String[] questions = {
        "Java kis type ki language hai?",
        "Java ka founder kaun hai?",
        "JVM ka full form kya hai?",
        "Java file ka extension kya hota hai?"
    };

    String[][] options = {
        {"Scripting", "Object-Oriented", "Procedural", "Markup"},
        {"James Gosling", "Dennis Ritchie", "Bjarne Stroustrup", "Guido van Rossum"},
        {"Java Virtual Machine", "Java Valuable Method", "Joint Virtual Mode", "Java Verified Module"},
        {".js", ".java", ".class", ".jv"}
    };

    // Correct answers
    char[] answers = {'B', 'A', 'A', 'B'};

    int current = 0;
    int score = 0;

    public QuizGame() {
        frame = new JFrame("Quiz Game");
        frame.setSize(450, 350);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 🎨 Background color set kiya gaya (Light Blue)
        frame.getContentPane().setBackground(new Color(173, 216, 230)); // Line 65

        frame.setVisible(true); // Frame dikhane ke liye
    }

    public static void main(String[] args) {
        new QuizGame();
    }
}
