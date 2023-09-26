import java.util.Scanner;
public class scannerCalculator {

    public static void main(String[] args){
        //defining variables as double to accept decimal value.
        double sum, difference, product, quotient, num1, num2;

        try (//defining Scanner class..
        Scanner input = new Scanner(System.in)) {
            //ask for the input of the user in the first number
            System.out.println("Enter num1: ");
            num1 = input.nextDouble();

            //ask the user for the second number
            System.out.println("Enter num2: ");
            num2 = input.nextDouble();
        }

        //operations..
        sum = num1 + num2;
        difference = num1 - num2;
        product = num1 * num2;
        quotient = num1 / num2;

        //printing the results..
        System.out.println("The sum of the wo numbers is "+ sum);//the sum
        System.out.println("The difference of the wo numbers is "+ difference);//the difference
        System.out.println("The product of the wo numbers is "+ product);//the product
        System.out.println("The quotient of the wo numbers is "+ quotient);//the quotient
        addSomeCodeHere();

        //end of the code..
        //nothing follows//

    }
    //function to add
    public static void addSomeCodeHere(){
        System.out.println("Hello to this world");
    }
}

/// nothing follows.. ---
//need to fix some code.
//CHAN-CHAN

