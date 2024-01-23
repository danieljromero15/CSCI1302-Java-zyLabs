package RightSideUpTriangle;

import java.util.Scanner;

public class LabProgram {

    /* TODO: Write recursive drawTriangle() method here. */
    //Assume the base length is always odd and less than 20
    public static void drawTriangle(int length) {
        switch(length){
            case 1:
                System.out.println("         *");
                break;
            case 3:
                drawTriangle(1);
                System.out.println("        ***");
                break;
            case 5:
                drawTriangle(3);
                System.out.println("       *****");
                break;
            case 7:
                drawTriangle(5);
                System.out.println("      *******");
                break;
            case 9:
                drawTriangle(7);
                System.out.println("     *********");
                break;
            case 11:
                drawTriangle(9);
                System.out.println("    ***********");
                break;
            case 13:
                drawTriangle(11);
                System.out.println("   *************");
                break;
            case 15:
                drawTriangle(13);
                System.out.println("  ***************");
                break;
            case 17:
                drawTriangle(15);
                System.out.println(" *****************");
                break;
            case 19:
                drawTriangle(17);
                System.out.println("*******************");
                break;
        }
    }

    public static void main(String[] args) {
        //drawTriangle(19);
        Scanner scan = new Scanner(System.in);
        int baseLength;

        baseLength = scan.nextInt();
        drawTriangle(baseLength);
    }
}