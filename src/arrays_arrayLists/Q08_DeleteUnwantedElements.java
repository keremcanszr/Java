package arrays_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class Q08_DeleteUnwantedElements {

    public static void main(String[] args) {
       /*
        Create a method that deletes the elements containing unwanted letters
        in a given String list and returns the remaining part as a list.

        */

        List<String> names = new ArrayList<>();
        names.add("Oliver");
        names.add("Lucas");
        names.add("Chloe");
        names.add("Noah");
        names.add("Mathias");
        names.add("Enzo");

        String unwantedLetter = "e";

        System.out.println(names); // [Oliver, Lucas, Chloe, Noah, Mathias, Enzo]

        List<String> namesThatWillNotBeErased = new ArrayList<>();

        for (int i = 0; i < names.size() ; i++) {

            if (!names.get(i).contains(unwantedLetter)){
                namesThatWillNotBeErased.add(names.get(i));
            }
        }

        names = namesThatWillNotBeErased;

        System.out.println(names); // [Lucas, Noah, Mathias, Enzo]


        /*
        Can we delete it directly without transferring it to another list?
         */

        unwantedLetter = "i";

        for (int i = 0; i < names.size(); i++) {

            if (names.get(i).contains(unwantedLetter)){
                names.remove(names.get(i));
                i--; //
            }
        }

        System.out.println(names); // [Lucas, Noah, Enzo]

    }
}
