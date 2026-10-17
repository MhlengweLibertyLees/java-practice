//imports
import java.util.Scanner;

class UserDetailsPrinter {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter name :");
        String name = input.nextLine();
        System.out.print("Enter surname :");
        String surname = input.nextLine();
        System.out.print("Enter city :");
        String city = input.nextLine();
        System.out.print("Enter age :");
        int age = input.nextInt();

        if(!name.isEmpty() && !surname.isEmpty() && !city.isEmpty() && age > 0){

            System.out.print("----User informatrion----\n");
            System.out.printf("""
                    Name : %s
                    Surname : %s
                    City : %s
                    Age : %d
                    """,name,surname,city,age);
        }else{
            if(name.isEmpty()){
                System.err.println("name is empty.");
            }
            if(surname.isEmpty()){
                System.err.println("surname is empty.");
            }
            if(city.isEmpty()){
                System.err.println("city is empty.");
            }
            if(age <= 0){
                System.err.println("age is invalid");
            }
        }

    }
}
