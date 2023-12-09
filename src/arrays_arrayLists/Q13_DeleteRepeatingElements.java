package arrays_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q13_DeleteRepeatingElements {

    public static void main(String[] args) {

        // Delete repeating elements in a given array
        // Make the array so that each element is used only once

        int[] arr = {3,6,1,4,7,3,9,4,2,3,6,1,4,3,5,3,1,4};

        List<Integer> non_repetitiveList = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            if (!non_repetitiveList.contains(arr[i])){

                non_repetitiveList.add(arr[i]);
            }

        }

        System.out.println(non_repetitiveList); // [3, 6, 1, 4, 7, 9, 2]

        // It is NOT the array that becomes non-repetitive, it is the list we created.

        // We must assign a new array value to the array
        // and move the elements in the list to the new array.


        arr = new int[non_repetitiveList.size()]; // [0, 0, 0, 0, 0, 0, 0]

        for (int i = 0; i < arr.length ; i++) {

            arr[i] = non_repetitiveList.get(i);
        }

        Arrays.sort(arr);

        System.out.println("Final state of the array : " + Arrays.toString(arr) );

    }
}
