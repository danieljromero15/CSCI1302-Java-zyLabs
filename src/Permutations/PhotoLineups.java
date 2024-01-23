package Permutations;

import java.util.ArrayList;
import java.util.Scanner;

public class PhotoLineups {

    // TODO: Write method to create and output all permutations of the list of names.
    public static void printAllPermutations(ArrayList<String> permList, ArrayList<String> nameList) {
        if (nameList.isEmpty()) {
            printList(permList);
        } else {
            for (int i=0; i < nameList.size(); ++i) {
                String tmpName = nameList.get(i);
                nameList.remove(i);
                permList.add(tmpName);

                printAllPermutations(permList, nameList);

                nameList.add(i, tmpName);
                permList.remove(permList.size() -1);
            }
        }
    }

    public static void printList(ArrayList<String> list) {
        for (int i = 0; i < list.size(); ++i) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<String> permList = new ArrayList<>();
        String name = "";

        // TODO: Read in a list of names; stop when -1 is read. Then call recursive method.
        while (!name.equals("-1")) {
            nameList.add(name);
            name = scan.next();
        }
        nameList.remove(0);
        //printList(nameList);
        printAllPermutations(permList, nameList);
    }
}