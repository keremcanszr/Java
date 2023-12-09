package arrays_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class Q01_SumOfThreeGroups {
    public static void main(String[] args) {
        /*

            Collect the elements in groups of 3 in a given int array
            and print these totals as a list.

        input  ==> int[] arr = {3,6,1,9,2,0,6,3,-1,-5,9,11,1,2,3,5,6,7};
        output ==> [10, 11, 8, 15, 6, 18]

         */

        int[] arr = {3, 6, 1, 9, 2, 0, 6, 3, -1, -5, 9, 11, 1, 2, 3, 5, 6, 7};

        List<Integer> sumList = new ArrayList<>();
        int sum = 0;
        int counter = 1;

        for (int i = 0; i < arr.length; i++) {

            if (counter == 3) {
                sum += arr[i];
                sumList.add(sum);
                sum = 0;
                counter = 1;

            } else {
                sum += arr[i];
                counter++;
            }
        }

        System.out.println(sumList);

    }
}
