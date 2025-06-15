import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizGame {
    JFrame frame;
    JLabel questionLabel, resultLabel;
    JRadioButton optA, optB, optC, optD;
    JButton nextButton;
    ButtonGroup group;

    // Questions and options
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

    // Correct answers (index of correct option)
    int[] answers = {1, 0, 0, 1};  // Indexes: B, A, A, B

    int current = 0;
    int score = 0;

    public QuizGame() {
        frame = new JFrame("Quiz Game");
        frame.setSize(450, 350);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().setBackground(new Color(173, 216, 230));

        questionLabel = new JLabel();
        questionLabel.setBounds(30, 30, 400, 30);
        frame.add(questionLabel);

        optA = new JRadioButton();
        optB = new JRadioButton();
        optC = new JRadioButton();
        optD = new JRadioButton();

        optA.setBounds(50, 70, 300, 30);
        optB.setBounds(50, 100, 300, 30);
        optC.setBounds(50, 130, 300, 30);
        optD.setBounds(50, 160, 300, 30);

        optA.setOpaque(false);
        optB.setOpaque(false);
        optC.setOpaque(false);
        optD.setOpaque(false);

        group = new ButtonGroup();
        group.add(optA);
        group.add(optB);
        group.add(optC);
        group.add(optD);

        frame.add(optA);
        frame.add(optB);
        frame.add(optC);
        frame.add(optD);

        nextButton = new JButton("Next");
        nextButton.setBounds(150, 210, 100, 30);
        frame.add(nextButton);

        resultLabel = new JLabel("");
        resultLabel.setBounds(50, 260, 300, 30);
        frame.add(resultLabel);

        showQuestion();

        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkAnswer();
                current++;
                if (current < questions.length) {
                    showQuestion();
                } else {
                    showResult();
                }
            }
        });

        frame.setVisible(true);
    }

    void showQuestion() {
        group.clearSelection();
        questionLabel.setText("Q" + (current + 1) + ": " + questions[current]);
        optA.setText("A. " + options[current][0]);
        optB.setText("B. " + options[current][1]);
        optC.setText("C. " + options[current][2]);
        optD.setText("D. " + options[current][3]);
    }

    void checkAnswer() {
        int selected = -1;
        if (optA.isSelected()) selected = 0;
        else if (optB.isSelected()) selected = 1;
        else if (optC.isSelected()) selected = 2;
        else if (optD.isSelected()) selected = 3;

        if (selected == answers[current]) {
            score++;
        }
    }

    void showResult() {
        questionLabel.setText("Quiz Khatam!");
        optA.setVisible(false);
        optB.setVisible(false);
        optC.setVisible(false);
        optD.setVisible(false);
        nextButton.setEnabled(false);
        resultLabel.setText("Aapka Score: " + score + " / " + questions.length);
    }

    public static void main(String[] args) {
        new QuizGame();
    }
}
