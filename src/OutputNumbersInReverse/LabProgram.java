package OutputNumbersInReverse;

import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] userList = new int[20];   // List of numElement integers specified by the user
        int numElements;                // Number of integers in user's list
        // Add more variables as needed

        numElements = scan.nextInt();   // Input begins with number of integers that follow

        for(int i=0; i < numElements; ++i){ //adds elements
            userList[i] = scan.nextInt();
        }
        System.out.println(reverseArrayPrint(userList, numElements));

    }

    public static String arrayPrint(int[] array, int numElements){
        StringBuilder returnString = new StringBuilder();
        for(int i=0; i < numElements; ++i){
            returnString.append(array[i]).append(",");
        }
        return returnString.toString();
    }

    public static String reverseArrayPrint(int[] array, int numElements){
        StringBuilder returnString = new StringBuilder();
        for(int i=(numElements - 1); i >= 0; --i){
            returnString.append(array[i]).append(",");
        }
        return returnString.toString();
    }
}