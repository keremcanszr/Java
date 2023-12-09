package arrays_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class Q07_DivisiblePositiveIntegers {

    public static void main(String[] args) {

       /*
       Create a method that returns a given positive integer
       as a list of all divisible positive integers.
        */

        int num = 20; // [1, 2, 4, 5, 10, 20]
        List<Integer> completeDivisorsList = new ArrayList<>();

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                completeDivisorsList.add(i);
            }

        }

        System.out.println("Complete Divisors List : " + completeDivisorsList);
    }
}
