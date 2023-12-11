package arrays;

public class Q02_sumOfTheElements {

    public static void main(String[] args) {

        //Question 2- Write a method that adds the positive integers in a given array and
        // returns the result to us.

        int[] arr = {3,4,-1,-7,9,-4,1,3,-9};
        int sum = 0;


        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] > 0){
                sum += arr[i] ;
            }
        }

        System.out.println("Sum of positive numbers in the array : " + sum);

        System.out.println(collectPositiveElements(arr));
    }


    public static int collectPositiveElements(int[] arr){

        int sum = 0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] > 0 ){
                sum += arr[i];
            }
        }
        return sum;
    }
}
