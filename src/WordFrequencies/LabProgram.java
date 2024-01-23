package WordFrequencies;

import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numWords = scan.nextInt(); //scan in number of words
        //System.out.println(numWords);

        String[] wordsList = new String[numWords];
        //int[] frequencyList = new int[numWords];

        for(int i=0; i < numWords; ++i){ //scan in words
            wordsList[i] = scan.next();
        }

        printArrayWithFrequencies(wordsList);
    }

    public static int printArrayFrequency(String[] list, String findingString){
        int frequencyNum = 0;
        for(String listElement:list){
            if(findingString.equals(listElement)){++frequencyNum;}
        }
        return frequencyNum;
    }

    public static void printArrayWithFrequencies(String[] list){
        for(String listElement:list){
            System.out.println(listElement + " - " + printArrayFrequency(list, listElement));
        }
    }
}