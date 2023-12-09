package arrays_arrayLists;

import java.util.Arrays;

public class Q12_TwoLayerArray {

    public static void main(String[] args) {

        /*
        Add the elements with the same index in a given two-layer array
        and assign these sums to a new single-layer array we will create.

                input :      int[][] arr =  {{3,4,5}, {2,3,6,7,8}};
        	    output:                       [5, 7, 11]
         */


        // The output array will be equal to the length of the short inner array
        // First, let's solve the question based on 2 inner arrays.

        int[][] arr =  {{3,4,5,1,9,2,3,4}, {2,3,6,7,8}};

        int outputLength = arr[0].length > arr[1].length ? arr[1].length : arr[0].length;
        int[] output = new int[outputLength]; // [0, 0, 0, 0, 0]

        for (int i = 0; i <outputLength ; i++) {

            output[i] = arr[0][i] + arr[1][i];
        }

        System.out.println(Arrays.toString(output)); // [5, 7, 11, 8, 17]
    }
}
