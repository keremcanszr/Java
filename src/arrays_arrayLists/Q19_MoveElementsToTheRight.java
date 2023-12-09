package arrays_arrayLists;

import java.util.Arrays;

public class Q19_MoveElementsToTheRight {
    public static void main(String[] args) {

        /*
        Create a method that will shift all the elements in a given array to the right,
        move the last element to the beginning, and save the array in its new form.
         */

        //		Ex :  input : [4,5,6,7]   output : [7,4,5,6]


        int[] arr = {4,5,-6,7,1,0};

        int temp = arr[arr.length-1]; // We put the last element in the empty bucket to make it dynamic.



        for (int i = arr.length-1 ; i >=1 ; i--) {

            arr[i] = arr[i-1];
        }

        // Let's put the element we took into the empty bucket at the top.
        arr[0] = temp;

        System.out.println(Arrays.toString(arr));


        int[] numbers = {3,0,2,5};

        numbers = moveElementsToTheRight(numbers);

        System.out.println("New version of numbers : "+ Arrays.toString(numbers));
    }

    public static int[] moveElementsToTheRight(int[] arr){


        int temp = arr[arr.length-1];

        for (int i = arr.length-1 ; i >=1 ; i--) {

            arr[i] = arr[i-1];
        }

        arr[0] = temp;

        return arr;
    }
}
