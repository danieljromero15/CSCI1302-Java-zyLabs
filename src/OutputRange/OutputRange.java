package OutputRange;

import java.util.Scanner;

public class OutputRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstInt = scan.nextInt();
        int secondInt = scan.nextInt();

        if (firstInt > secondInt) {
            System.out.print("Second integer can't be less than the first.");
        } else {
            while (firstInt <= secondInt) {
                System.out.print(firstInt + " ");
                firstInt += 5;
            }
        }
        System.out.print("\n"); // here because zybooks bad

        scan.close();
    }
}
