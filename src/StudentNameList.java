//import
import java.util.ArrayList;

public class StudentNameList {
    public static void main(String[] args){

        ArrayList<String> names = new ArrayList<>();

        //adding names to the object names created
        names.add("Liberty");
        names.add("Ambition");
        names.add("Lonene");

        System.out.print("My arraylist has " + names.size() + " names\n");

        System.out.println("--list of names in my arraylist--");
        /*int count = 0;
        for(String name : names){
            count++;
            //displaying names
            System.out.println(count  + ". " +name);
        }*/
        for(int i=0; i<names.size(); i++){
            System.out.println(i+1  + ". " +names.get(i));
        }

        //removing 1 names
        names.remove("Liberty");

        System.out.println("\n--new list after removing 1 name--");
        /*int newList = 0;
        for(String name : names){
            newList++;
            //displaying names
            System.out.println(newList  + ". " +name);
        }*/
        for(int i=0; i<names.size(); i++){
            System.out.println(i+1  + ". " +names.get(i));
        }
    }
}
