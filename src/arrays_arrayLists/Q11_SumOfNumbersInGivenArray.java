package arrays_arrayLists;

import java.util.Arrays;

public class Q11_SumOfNumbersInGivenArray {

    public static void main(String[] args) {

        int[][] arr =  {{3,1,2,4,6},{1,2},{3,4,5},{10},{2,7,1}};
        int sum = 0;
        // Print the sum of all elements in this array

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                sum += arr[i][j] ;
            }
        }

        System.out.println("Sum of all elements : " + sum);
        // Total of all elements: 44

        /*
        In a given two-layer array, add the elements in each inner array
        and assign these sums to a new single-layer array we will create.

        input :      int[][] arr =  {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        output:      [10, 3, 12, 10, 9]
         */


        int[] output = new int[arr.length];

        for (int i = 0; i < arr.length ; i++) {
            sum =0;
            for (int j = 0; j <arr[i].length ; j++) {

                sum += arr[i][j];

            }
            output[i] = sum;
        }

        System.out.println(Arrays.toString(output));

    }

}
