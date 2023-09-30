import java.util.ArrayList;
import java.util.Scanner;

public class puzzleGame {
    public static void main(String[] args){
            String[] questions = {
                    "1. What are the tallest mountain in the world? ",
                    "2. Who discover the Phillippines? ",
                    "3. Who is the founder of the Revolutionary Army?",
                    "4. Who is the developer of this program? ",
                    "5. What is the name of the main character of the anime One Piece"
            };
        int i;
        int qlength = questions.length;

            for(i=0; i<=qlength; i++){
                System.out.println(questions[i]);
            }
    }
}
