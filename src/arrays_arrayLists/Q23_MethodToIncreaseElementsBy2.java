package arrays_arrayLists;

import java.util.Arrays;

public class Q23_MethodToIncreaseElementsBy2 {

    public static void main(String[] args) {

       /*
       Create a method that increases all elements of a given int array by 2
       and returns it to us. Save the old array as new.
        */

        int[] arr = {5,1,7,9,2};

        /*
        If you need to go through all the elements of the array we use a for loop
         */

        for (int i = 0; i < arr.length ; i++) {

            arr[i] = arr[i] + 2 ;

        }

        System.out.println(Arrays.toString(arr)); //  [7, 3, 9, 11, 4]


        arr = increaseElements(arr,2);

        System.out.println(Arrays.toString(arr)); // [9, 5, 11, 13, 6]

        arr = increaseElements(arr,5);

        System.out.println(Arrays.toString(arr)); // [14, 10, 16, 18, 11]

    }

    public static int[] increaseElements(int[] arr , int increaseAmount){

        for (int i = 0; i < arr.length ; i++) {

            arr[i]  = arr[i] + increaseAmount ;
        }

        return arr;
    }
}
