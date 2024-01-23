package RightSideUpTriangle;

import java.util.Scanner;

public class Triangle {

    /* TODO: Write recursive drawTriangle() method here. */
    //Assume the base length is always odd and less than 20
    public static String drawTriangle(int length) {
        if (length <= 0) {return "";}
        String triangle = drawTriangle(length - 1);
        triangle += "*";
        if (length % 2 != 0) {
            System.out.println(triangle + length);
        }
        return triangle;
    }

    public static void main(String[] args) {
        //drawTriangle(19);
        Scanner scan = new Scanner(System.in);
        int baseLength;

        baseLength = scan.nextInt();
        drawTriangle(baseLength);
    }
}