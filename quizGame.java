import java.util.Scanner;
class quizGame{

    public static String answer1, answer2, answer3, answer4, answer5;
    public static String ans1 = "Steve Jobs";
    public static String ans2 = "Christian Barbosa";
    public static String ans3 = "Fredrik Idestam";
    public static String ans4 = "George Zhu";
    public static String ans5 = "Ren Zhengfei";

    public static int score = 0;
    public static void main(String[] args){
        System.out.println("Welcome to our Quiz Game");

        Scanner input = new Scanner(System.in);

        System.out.println("Who is the Founder of Apple Incorporation?. ");
        answer1 = input.nextLine();
        if(answer1.equals(ans1)){
            System.out.println("You got the correct answer!!");
            score++;
        }else{
            System.out.println("Sorry you got a wrong answer..");
        }

        System.out.println("Who is the Founder of Samsung Incorporation?. ");
        answer2 = input.nextLine();
        if(answer2.equals(ans2)){
            System.out.println("You got the correct answer!!");
            score++;
        }else{
            System.out.println("Sorry you are wrong..");
        }

        System.out.println("Who is the Founder of Nokia Incorporation?. ");
        answer3 = input.nextLine();
        if(answer3.equals(ans3)){
            System.out.println("You Got the right one, Nice..");
            score++;
        }else{
            System.out.println("You got it wrong..");
        }

        System.out.println("Who is the Founder of Infinix Incorporation?. ");
        answer4 = input.nextLine();
        if(answer4.equals(ans4)){
            System.out.println("You are right.");
            score++;
        }else{
            System.out.println("Well you are wrong");
        }

        System.out.println("Who is the Founder of Huawei Incorporation?. ");
        answer5 = input.nextLine();
        if(answer5.equals(ans5)){
            System.out.println("Great! you got it right..");
            score++;
        }else{
            System.out.println("You are wrong");
        }
        grade();
        System.out.println("Score: "+ score);

    }

    public static void grade(){
        if(score==5){
            System.out.println("Wow you Make it Perfect!! ");
        }else if(score <=4){
            System.out.println("You did a great job.");
        }else{
            System.out.println("You failed");
        }
    }
}