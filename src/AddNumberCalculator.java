import java.util.Scanner;

public class AddNumberCalculator {
    public static void main(String[] args)
    {
        int num1,num2;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number :");
        num1 = input.nextInt();

        System.out.print("Enter second num :");
        num2 = input.nextInt();

        //add num1 and num2 , that the user provided
        int sum = num1 + num2;

        System.out.println("Answer : " + num1 + " + " + num2 + " = " + sum);
    }
}
