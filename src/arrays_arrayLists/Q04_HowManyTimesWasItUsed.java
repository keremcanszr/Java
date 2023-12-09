package arrays_arrayLists;

import java.util.Arrays;
import java.util.Scanner;

public class Q04_HowManyTimesWasItUsed {
    public static void main(String[] args) {

        /*
        Take a sentence and a letter from the user,
        without being case sensitive,
        if the letter is used in the sentence,
        print the number of times it is used,
        if not, print “letter not used in the sentence”.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence.");
        String sentence = scanner.nextLine();

        System.out.println("Enter the letter to search for.");
        String letter = scanner.next().substring(0,1);

        /*
            We can reach each letter in the sentence in two ways: 
            1- with for-loop and substring, 
            2- by converting it to array with split and for-each loop.
         */

        String[] fragmentedSentenceArray = sentence.split("");
        // [I,  , l, o, v, e,  , w, r, i, t, i, n, g,  , c, o, d, e]

        int counter =0;

        for (String each : fragmentedSentenceArray
        ) {
            if (each.equalsIgnoreCase(letter)){
                counter++;
            }

        }

        if (counter == 0 ) {
            System.out.println("Letter not used in sentence.");
        }else{
            System.out.println("The given letter is used " + counter + " times in the sentence");
        }

    }
}
