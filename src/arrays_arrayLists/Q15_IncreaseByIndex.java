package arrays_arrayLists;

import java.util.Arrays;

public class Q15_IncreaseByIndex {

    public static void main(String[] args) {

        /*
        In the given 2-layer multidimensional array,
        increase the elements by the index in the inner array they are in.
         */

        int[][] arr = {{4,-1,-5},{6,-9,2},{1,5,-8,-4,3,6}};

        for (int i = 0; i < arr.length ; i++) { // inner arrays

            for (int j = 0; j <arr[i].length ; j++) { // Index of elements in inner array


                arr[i][j] += j ;

            }

        }

        System.out.println(Arrays.deepToString(arr));
        //         [[4, 0, -3], [6, -8, 4], [1, 6, -6, -1, 7, 11]]
    }
}
