package arrays_arrayLists;

public class Q17_SumOfEvenNumbers {

    public static void main(String[] args) {

        // print the sum of even numbers in a given array

        int[] arr1 = {3,4,6,9,0,2,5,6,8,1};

        int sum = 0;

        for (int i = 0; i < arr1.length ; i++) {

            if (arr1[i] % 2 == 0){

                sum += arr1[i] ;
            }
        }

        System.out.println(sum); // 26


        int[][] arr2 = {{3,4,6},{9,0},{2,5,6,8,1}};

        // Print the sum of even numbers in this two-layer array

        sum =0;

        for (int i = 0; i < arr2.length ; i++) { // It checks the inner arrays, that is, the first []

            for (int j = 0; j <arr2[i].length ; j++) { // checks the elements in the inner array, i.e. second []

                if (arr2[i][j] % 2 == 0){
                    sum += arr2[i][j];
                }
            }
        }

        System.out.println(sum);

    }
}
