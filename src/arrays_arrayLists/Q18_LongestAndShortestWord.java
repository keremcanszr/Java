package arrays_arrayLists;

public class Q18_LongestAndShortestWord {

    public static void main(String[] args) {
      
    /*
    Create a method that prints the longest 
    and shortest words in a given String array. 
    If names are of the same length, any of them can be printed
     */

        String[] names = {"Olivia","Jones","George","Mary","Jack","Clara"};

        longAndShortNamePrint(names);
    }


    public static void longAndShortNamePrint(String[] names){

        String longestName = names[0];
        String shortestName = names[0];

        for (int i = 1; i < names.length ; i++) {

            if (names[i].length()>longestName.length()){
                longestName = names[i];
            }

            if (names[i].length()<shortestName.length()){
                shortestName = names[i];
            }

        }

        System.out.println("Longest Name : " + longestName);
        System.out.println("Shortest Name : " + shortestName);
    }

}
