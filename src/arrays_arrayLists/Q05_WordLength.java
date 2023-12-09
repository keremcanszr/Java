package arrays_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class Q05_WordLength {

    public static void main(String[] args) {

        /*
        Given String, check each element in a List and
        - If the length of the word is an even number, write the first half
        - If the length of the word is an odd number, add the second half, including the letter in the middle,
        to a new list and print it.
         */

        List<String> names = new ArrayList<>();
        names.add("Valentina");
        names.add("Diego");
        names.add("Juan");
        names.add("Cristobal");
        names.add("Julia");
        names.add("Lukas");
        names.add("Felix");

        List<String> newList = new ArrayList<>();

        for (String each : names
        ) {

            if (each.length() % 2 == 0){ // If the length of the word is even

                newList.add(each.substring(0,each.length()/2));

            }else{ // if the length of the word is odd
                newList.add(each.substring(each.length()/2));
            }
        }

        System.out.println(newList); // [ntina, ego, Ju, tobal, lia, kas, lix]

    }
}
