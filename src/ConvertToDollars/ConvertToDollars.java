package ConvertToDollars;

import java.util.Scanner;

public class ConvertToDollars { // Zybooks is LabProgram
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quarters = scan.nextInt();
        int dimes = scan.nextInt();
        int nickels = scan.nextInt();
        int pennies = scan.nextInt();

        //System.out.println("" + val1 + val2 + val3 + val4);

        double dollars = 0;

        dollars = dollars + (quarters*0.25);
        dollars = dollars + (dimes*0.10);
        dollars = dollars + (nickels*0.05);
        dollars = dollars + (pennies*0.01);

        System.out.printf("Amount: $%.2f\n", dollars);


        scan.close();
    }
}