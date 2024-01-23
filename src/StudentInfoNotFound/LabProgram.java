package StudentInfoNotFound;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

// src/StudentInfoNotFound/roster.txt

public class LabProgram {

    public static String findID(String studentName, Scanner infoScnr) throws Exception {
        String currentName;
        String currentID;
        while(infoScnr.hasNext()){
            currentName = infoScnr.next();
            currentID = infoScnr.next();
            if(currentName.equals(studentName)){
                return currentID;
            }
        }
        throw new Exception("Student ID not found for " + studentName);
    }

    public static String findName(String studentID, Scanner infoScnr) throws Exception {
        String currentName;
        String currentID;
        while(infoScnr.hasNext()){
            currentName = infoScnr.next();
            currentID = infoScnr.next();
            if(currentID.equals(studentID)){
                return currentName;
            }
        }
        throw new Exception("Student name not found for " + studentID);
    }

    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        String studentName;
        String studentID;
        String studentInfoFileName;
        FileInputStream studentInfoStream;
        Scanner studentInfoScanner;

        // Read the text file name from user
        studentInfoFileName = scnr.next();

        // Open the text file
        studentInfoStream = new FileInputStream(studentInfoFileName);
        studentInfoScanner = new Scanner(studentInfoStream);

        // Read search option from user. 0: findID(), 1: findName()
        int userChoice = scnr.nextInt();

        // FIXME: findID() and findName() may throw an Exception.
        //        Insert a try/catch statement to catch the exception and output the exception message.

        if (userChoice == 0) {
            studentName = scnr.next();
            try {
                studentID = findID(studentName, studentInfoScanner);
                System.out.println(studentID);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            studentID = scnr.next();
            try {
                studentName = findName(studentID, studentInfoScanner);
                System.out.println(studentName);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        studentInfoStream.close();
    }
}