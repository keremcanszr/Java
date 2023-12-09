package arrays_arrayLists;

public class Q21_HowManyTimesWasItUsed {

    public static void main(String[] args) {

        /*
        Create a method that prints whether a desired element exists in a given array and, if so, how many times it is used.
         */

        String[] letters = {"a","c","r","s","a","a","s","k","a"};

        String searchedLetter = "m";

        int counter = 0;

        for (int i = 0; i < letters.length ; i++) {

            if (letters[i].equals(searchedLetter)){
                counter++;
            }
        }

        if (counter == 0){
            System.out.println("The given letter " + searchedLetter + " is not in the array");
        }else {
            System.out.println("There are " + counter + " of the given letter " + searchedLetter + " in the array.");
        }

    }

    public static void elementSearch(String[] arr , String wantedElement){

        int counter = 0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i].equals(wantedElement)){
                counter++;
            }
        }

        if (counter == 0){
            System.out.println("The requested element, the letter " + wantedElement + " is not in the array.");
        }else {
            System.out.println("The requested element is the letter " + wantedElement + " used " + counter + " times in the array.");
        }
    }
}
