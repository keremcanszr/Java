package arrays_arrayLists;

public class Q14_MultiplicationOfAllNumbers {

    public static void main(String[] args) {

        /*
        Create a method that returns the product of all numbers
        in a given 2-layer array.
         */


        int[][] arr = {{4,-1,-5},{6,-9,2},{1,5,-8,-4,3,6}};

        System.out.println(multiplicationOfElements(arr)); // -6220800

    }


    public static int multiplicationOfElements(int[][] arr){

        int multiplication = 1;

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                multiplication *= arr[i][j];
            }
        }
        return  multiplication;
    }
}
