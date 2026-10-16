//imports
import java.util.Scanner;

public class DisplayMenu {

    private static void printMenu() {
        System.out.print("""
               Calculator Menu
               1. Add
               2. Subtract
               3. Multiply
               4. Divide
               5. Exit Calculator
               Choose option:
               """);
    }

    private static int[] promptUserForTwoNumbers(Scanner input) {
        System.out.print("Enter first number :");
        int num1 = input.nextInt();
        System.out.print("Enter second number :");
        int num2 = input.nextInt();

        return new int[]{num1,num2};
    }

    public static void main(String[] args){

        int sum;
        int subtract;
        int multiply;
        double divide;

        Scanner input = new Scanner(System.in);

        //call menu method
        printMenu();
        int option = input.nextInt();
        int[] numbersInput;

        while(true){
            switch(option){
                case 1:
                    numbersInput = promptUserForTwoNumbers(input);
                    sum = numbersInput[0] + numbersInput[1];

                    System.out.println("Answer:" + numbersInput[0] + " + " + numbersInput[1] + " = " +sum);
                    break;
                case 2:
                    numbersInput = promptUserForTwoNumbers(input);
                    subtract = numbersInput[0] - numbersInput[1];

                    System.out.println("Answer:" + numbersInput[0] + " - " + numbersInput[1] + " = " +subtract);
                    break;
                case 3:
                    numbersInput = promptUserForTwoNumbers(input);
                    multiply = numbersInput[0] * numbersInput[1];

                    System.out.println("Answer:" + numbersInput[0] + " x " + numbersInput[1] + " = " +multiply);
                    break;
                case 4:
                    numbersInput = promptUserForTwoNumbers(input);

                    if(numbersInput[1] != 0){
                        divide = (double)numbersInput[0] / numbersInput[1];
                        System.out.println("Answer:" + numbersInput[0] + " ÷ " + numbersInput[1] + " = " +divide);
                    }else{
                        System.out.println("Cannot divide a number by zero");
                    }
                    break;
                case 5:
                    System.out.println("You are done using Calculator. Goodbye!");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid option! Choose between 1 and 5.");
                    break;

            }

            printMenu();
            option = input.nextInt();
        }


    }
}
