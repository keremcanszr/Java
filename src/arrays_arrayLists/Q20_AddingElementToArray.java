package arrays_arrayLists;

import java.util.Arrays;

public class Q20_AddingElementToArray {
    public static void main(String[] args) {

        /*
        Write a method that adds a desired element to a given array
        and returns it to us, and assign the new value to the old array.
         */


        int[] arr = {3,6,7,9};
        int elementToBeAdded = 1 ;

        // arr[3] = element to be added; // ArrayIndexOutOfBoundsException

        // First, let's create a new Arr for 4 people.

        int[] newArr = new int[arr.length+1];  // [0, 0, 0, 0]

        // Let's create a for loop and copy all the elements in the old array to the new array.

        for (int i = 0; i <arr.length ; i++) {

            newArr[i] = arr[i];
        }

        // Let's assign the number to be added to newArr as the last element.
        newArr[newArr.length-1] = elementToBeAdded;

        arr = newArr;

        System.out.println(Arrays.toString(arr)); // [3, 6, 7, 9, 1]


        // Let's add 5,7 and 3 as new elements to the array.

        arr = addElementToArray(arr,5);
        arr = addElementToArray(arr,7);
        arr = addElementToArray(arr,3);

        System.out.println(Arrays.toString(arr));



    }


    public static int[] addElementToArray(int[] arr , int numberToAdd){

        // First, let's create a new array whose length is 1 longer than the old array.
        int[] newArr = new int[arr.length + 1];

        // Let's assign all elements from the old array to the new array.
        for (int i = 0; i < arr.length; i++) {

            newArr[i] = arr[i];

        }

        // Let's assign the number to be added as the last element.

        newArr[newArr.length-1] = numberToAdd;

        return newArr;
    }
}
