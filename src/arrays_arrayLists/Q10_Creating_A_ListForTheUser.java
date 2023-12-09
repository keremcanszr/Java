package arrays_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10_Creating_A_ListForTheUser {

    public static void main(String[] args) {

        /*
        Create a method that takes as many names as you want
        from the user and returns the names entered as a list
        when you press Q.
         */


        System.out.println(createList());

    }


    public static List<String> createList(){

        Scanner scanner = new Scanner(System.in);
        List<String> listOfEnteredNames = new ArrayList<>();
        String enteredName = "";

        while (!enteredName.toUpperCase().equals("Q")){

            System.out.println("Please enter a name to be added to the list.\npress Q to finish");

            enteredName = scanner.nextLine();   // since we don't know what the user logged in.
                                                //let's check it once more before adding it to the list.
            if (!enteredName.toUpperCase().equals("Q")){
                listOfEnteredNames.add(enteredName);
            }

        }

        return listOfEnteredNames;
    }
}
