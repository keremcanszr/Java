package arrays;

import java.util.Arrays;

public class Q01_increasingElementsInArray {
    public static void main(String[] args) {

        //Question 1- Increasing all elements of a given int array by 2
        // Create a method that returns us.
        // Save the old array as new.

        int[] arr = {5,1,7,9,2};

        // if you need to go through all the elements of the array
        // we use a for loop

        for (int i = 0; i < arr.length ; i++) {

            arr[i] = arr[i] + 2 ;

        }

        System.out.println(Arrays.toString(arr)); //  [7, 3, 9, 11, 4]


        arr = increaseElements(arr,2);

        System.out.println(Arrays.toString(arr)); // [9, 5, 11, 13, 6]

        arr = increaseElements(arr,5);

        System.out.println(Arrays.toString(arr)); // [14, 10, 16, 18, 11]

    }

    public static int[] increaseElements(int[] arr , int increasement){

        for (int i = 0; i < arr.length ; i++) {

            arr[i]  = arr[i] + increasement ;
        }

        return arr;
    }
}
