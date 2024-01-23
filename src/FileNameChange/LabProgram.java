package FileNameChange;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) throws IOException {
        //Scanner scan = new Scanner(System.in);
        FileInputStream fileStream = new FileInputStream("src/FileNameChange/ParkPhotos.txt");
        Scanner scan = new Scanner(fileStream);
        String currentLine;

        while (scan.hasNextLine()) {
            //System.out.println(scan.nextLine());
            currentLine = scan.nextLine();
            currentLine = currentLine.substring(0, currentLine.length() - 9);
            currentLine = currentLine + "info.txt";
            System.out.println(currentLine);
        }
    }
}
