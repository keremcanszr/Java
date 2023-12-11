package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q03_methodThatFreezesAnArray {

    public static void main(String[] args) {

        /*
        Create a method that takes the size and integer elements of the array from the user,
        creates the array and returns it to us.
         */



        int[] myArray = createArray();

        System.out.println("Benim array : "+ Arrays.toString(myArray));


        // benim array'imdeki tum sayilari 4 artirin

        myArray = Q01_increasingElementsInArray.increaseElements(myArray, 4);


        System.out.println("My array : "+ Arrays.toString(myArray));
    }


    public static int[] createArray(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many elements you will put in the array.");

        int numberOfElements = scanner.nextInt();

        int[] arr = new int[numberOfElements];

        for (int i = 0; i < arr.length ; i++) {

            System.out.println("Enter an integer to add to the Array");
            arr[i] = scanner.nextInt();

        }

        return arr;

    }
}
