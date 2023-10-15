import java.util.Scanner;

class QuizGame {
    //Arrays of questions in sequence
    public static final String[] QUESTIONS = {
            "Who is the Founder of Apple Incorporation?",
            "Who is the Founder of Samsung Incorporation?",
            "Who is the Founder of Nokia Incorporation?",
            "Who is the Founder of Infinix Incorporation?",
            "Who is the Founder of Huawei Incorporation?",
            "Who developed this program? ",
            "How many questiions are there in this quiz? (including this one)(in number)"
    };

    //Arrays of answer in the questions
    public static final String[] ANSWERS = {
            "Steve Jobs",
            "Lee Byung-chul",
            "Fredrik Idestam",
            "George Zhu",
            "Ren Zhengfei",
            "Christian Barbosa",
            "7"
    };

    public static int score = 0;//starting score

    public static void main(String[] args) {
        System.out.println("Welcome to our Quiz Game");

        Scanner input = new Scanner(System.in);
        //looping the questions base on the question arrays..
        for (int i = 0; i < QUESTIONS.length; i++) {
            System.out.println(QUESTIONS[i]);
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase(ANSWERS[i])) {
                System.out.println("You got the correct answer!!");//if answer is  correct
                score++;
            } else {
                System.out.println("Sorry, you got a wrong answer..");//else if not correct
            }
        }
        System.out.println("Score: " + score + " points");
        grade();//functions fot the grades base on the score
    }

    //grade your score base on the points you get from the quiz Game
    //validations of the scores
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
//Todo: Add new Features soon..
//This Project is a simple console base quiz game