package arrays_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class Q02_DesiredLetter {
    public static void main(String[] args) {

        /*
        Print names containing the desired letter in a given String array as a List
         */

        String[] names = {"Oliver","Mia","Chloe","Nathan","Jonas","Catalina","Diego"};

        String desiredLetter = "l";

        List<String> listOfProperNames = new ArrayList<>();

        for (int i = 0; i < names.length ; i++) {

            if (names[i].contains(desiredLetter)){

                listOfProperNames.add(names[i]);
            }
        }

        System.out.println("Names containing the desired letter : " + listOfProperNames);

        
    }
}
