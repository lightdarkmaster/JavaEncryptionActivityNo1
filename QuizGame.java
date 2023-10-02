import java.util.Scanner;

class QuizGame {
    public static final String[] QUESTIONS = {
            "Who is the Founder of Apple Incorporation?",
            "Who is the Founder of Samsung Incorporation?",
            "Who is the Founder of Nokia Incorporation?",
            "Who is the Founder of Infinix Incorporation?",
            "Who is the Founder of Huawei Incorporation?",
            "Who developed this program? "
    };

    public static final String[] ANSWERS = {
            "Steve Jobs",
            "Lee Byung-chul",
            "Fredrik Idestam",
            "George Zhu",
            "Ren Zhengfei",
            "Christian Barbosa"
    };

    public static int score = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to our Quiz Game");

        Scanner input = new Scanner(System.in);
        //looping the questions base on the question arrays..
        for (int i = 0; i < QUESTIONS.length; i++) {
            System.out.println(QUESTIONS[i]);
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase(ANSWERS[i])) {
                System.out.println("You got the correct answer!!");
                score++;
            } else {
                System.out.println("Sorry, you got a wrong answer..");
            }
        }
        System.out.println("Score: " + score + " points");
        grade();
    }

    //grade your score base on the points you get from the quiz Game
    public static void grade() {
        if (score == 6) {
            System.out.println("Wow, you got them all correct!!");
        } else if (score <= 5 && score > 0) {
            System.out.println("You did a great job.");
        } else {
            System.out.println("You failed");
        }
    }
}
