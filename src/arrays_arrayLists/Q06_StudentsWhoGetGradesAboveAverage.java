package arrays_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q06_StudentsWhoGetGradesAboveAverage {
    public static void main(String[] args) {
        /*
        Ask a teacher for the student's name and grade.
        When the teacher presses Q, finish the process
        and print the names of the students who got grades above the average as a list.

        tip: keep names and notes as 2 separate lists
         */
        
        Scanner scanner = new Scanner(System.in);
        List<String> listOfNames = new ArrayList<>();
        List<Double> listOfNotes = new ArrayList<>();
        double enteredNot = 0;
        double totalOfNotes = 0;
        String enteredName ="";

        while (!enteredName.toUpperCase().equals("Q")){

            System.out.println("Please enter student name");
            enteredName = scanner.nextLine();

            if (!enteredName.toUpperCase().equals("Q")){

                listOfNames.add(enteredName);


                System.out.println("Please enter the student's grade");
                enteredNot = scanner.nextDouble();
                scanner.nextLine();
                totalOfNotes += enteredNot;
                listOfNotes.add(enteredNot);
            }
        }

        double average = totalOfNotes / listOfNotes.size();

       /*
       We have a list of notes and a list of names.
       Review the notes in the list of notes related to the name and note in the same index
       and write the name of the ones above the average first and the note next to it.
        */

        System.out.println("Average grade : " + average);
        System.out.println("Students who get above average grades");

        for (int i = 0; i < listOfNames.size() ; i++) {

            if (listOfNotes.get(i) >= average){

                System.out.println(
                        listOfNames.get(i)
                                + " " +
                                listOfNotes.get(i)
                );
            }
        }
    }
}
