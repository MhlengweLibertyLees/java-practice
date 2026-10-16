//imports
import java.util.Scanner;

public class DisplayMenu {
    public static void main(String[] args){

        int num1,num2;
        int sum;
        int subtract;
        int multiply;
        double divide;

        Scanner input = new Scanner(System.in);

        System.out.print("""
                Calculator Menu
                1.Add
                2.Subtract
                3.Multiply
                4.divide
                5.Exit Calculator
                Choose option :
                """);

        int option = input.nextInt();

        while(true){

            switch(option){
                case 1:
                    System.out.print("Enter first number :");
                    num1 = input.nextInt();
                    System.out.print("Enter second number :");
                    num2 = input.nextInt();

                    sum = num1 + num2;
                    System.out.println("Answer:" + num1 + " + " + num2 + " = " +sum);
                    break;
                case 2:
                    System.out.print("Enter first number :");
                    num1 = input.nextInt();
                    System.out.print("Enter second number :");
                    num2 = input.nextInt();

                    subtract = num1 - num2;
                    System.out.println("Answer:" + num1 + " - " + num2 + " = " +subtract);
                    break;
                case 3:
                    System.out.print("Enter first number :");
                    num1 = input.nextInt();
                    System.out.print("Enter second number :");
                    num2 = input.nextInt();

                    multiply = num1 * num2;
                    System.out.println("Answer:" + num1 + " x " + num2 + " = " +multiply);
                    break;
                case 4:
                    System.out.print("Enter first number :");
                    num1 = input.nextInt();
                    System.out.print("Enter second number :");
                    num2 = input.nextInt();

                    if(num2 != 0){
                        divide = (double)num1 / num2;
                        System.out.println("Answer:" + num1 + " ÷ " + num2 + " = " +divide);
                    }else{
                        System.out.println("Cannot divide a number by zero");
                    }
                case 5:
                    System.out.println("You are done using Calculator. Goodbye!");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid option! Choose between 1 and 4.");
                    break;

            }

            System.out.print("""
                Calculator Menu
                1.Add
                2.Subtract
                3.Multiply
                4.divide
                Choose option :
                """);
            option = input.nextInt();
        }


    }
}
