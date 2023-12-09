package arrays_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q03_SeparateArrayOfEvenNumbers {
    public static void main(String[] args) {

        /*
        Take even numbers from a given int array
        and save them as a separate array
         */

        int[] arr = {3,5,1,7,9,0,4,2,6,7,8,1,5,8,7,6};

        List<Integer> evenNumersList = new ArrayList<>();

        for (int each : arr
        ) {

            if (each % 2 == 0){
                evenNumersList.add(each);
            }
        } // [0, 4, 2, 6, 8, 8, 6]

        int[] evenNumersArray = new int[evenNumersList.size()];

        /*
        It makes sense to do this with a for loop,
        but here I wanted to use each for loop.
         */

        int index = 0;
        for (int each : evenNumersList
        ) {
            evenNumersArray[index] = evenNumersList.get(index);
            index++;
        }


        System.out.println("Even numbers array : " + Arrays.toString(evenNumersArray));



    }
}
