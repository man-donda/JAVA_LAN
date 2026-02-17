import java.util.*;

public class PROJECT_1_QUIZ_GAME {

    static class Question {
        String questionText;
        String[] options;
        int correctAnswer;

        Question(String questionText, String[] options, int correctAnswer) {
            this.questionText = questionText;
            this.options = options;
            this.correctAnswer = correctAnswer;
        }
    }

    public static void main(String[] args) {
        int choice;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 for Start the Game.");
            System.out.println("Enter 2 for Exit the Game.");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    ArrayList<Question> questions = new ArrayList<>();

                    // Adding Questions
                    questions.add(new Question(
                            "Who is the Prime minister of India?",
                            new String[] { "1. Narendra Modi", "2. Rahul gandhi", "3. Lalu Yadav", "4. Amit Shah" },
                            1));

                    questions.add(new Question(
                            "Who is the Home minister of India",
                            new String[] { "1. Amit Shah", "2. Yogi Aditynath", "3. S. JayShankar",
                                    "4. Chirag Paswan" },
                            1));

                    questions.add(new Question(
                            "Who is the Foreign Minister of India?",
                            new String[] { "1. Jay Shah", "2. Dr S. Jayshankar", "3. Yogi Adityanath",
                                    "4. Narendra Modi" },
                            2));

                    questions.add(new Question(
                            "Who is the BJP member of Rajysabha?",
                            new String[] { "1. Shakti sinh Gohil", "2. Mallikarjun Kharge", "3. Sudhanshu Trivedi",
                                    "4. Arving Kejriwal" },
                            3));

                    questions.add(new Question(
                            "When was the BJP offically founded?",
                            new String[] { "1. 1975", "2. 1980", "3. 1962", "4. 1991" }, 2));

                    int score = 0;

                    System.out.println("----- Welcome to the Java Quiz -----\n");

                    for (int i = 0; i < questions.size(); i++) {

                        Question q = questions.get(i);

                        System.out.println("Q" + (i + 1) + ": " + q.questionText);

                        for (String option : q.options) {
                            System.out.println(option);
                        }

                        System.out.print("Enter your answer (1-4): ");
                        int userAnswer = sc.nextInt();

                        if (userAnswer == q.correctAnswer) {
                            System.out.println(" Correct!\n");
                            score++;
                        } else {
                            System.out.println(" Wrong! Correct answer is: " + q.options[q.correctAnswer - 1] + "\n");
                        }
                    }

                    System.out.println("===== Quiz Finished =====");
                    System.out.println("Your Score: " + score + "/" + questions.size());

                    double percentage = (score * 100.0) / questions.size();
                    System.out.println("Percentage: " + percentage + "%");

                    if (percentage >= 80) {
                        System.out.println(" Excellent Performance!\n");
                    } else if (percentage >= 50) {
                        System.out.println(" Good Job!\n");
                    } else {
                        System.out.println(" Keep Practicing!\n");
                    }
                    break;

                case 2:
                    System.out.println("Exiting Program.");
                    break;

                case 3:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 2);
    }
}