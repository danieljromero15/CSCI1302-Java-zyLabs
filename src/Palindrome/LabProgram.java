package Palindrome;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class LabProgram {

    public static boolean palindrome(Deque<Character> deque) {
        boolean isPalindrome = true;
        while (!deque.isEmpty()) {
            if (deque.size() == 1) {
                deque.add(deque.peek());
            }
            if (deque.pollFirst() != deque.pollLast()) {
                isPalindrome = false;
            }
        }

        return isPalindrome;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        String line;
        Deque<Character> dequeOfChars = new LinkedList<>();

        line = scan.nextLine();
        for (i = 0; i < line.length(); ++i) {
            if (Character.isLetter(line.charAt(i))) {
                dequeOfChars.addLast(line.charAt(i));
            }
        }

        if (palindrome(dequeOfChars)) {
            System.out.println("Yes, \"" + line + "\" is a palindrome.");
        } else {
            System.out.println("No, \"" + line + "\" is not a palindrome.");
        }
    }
}
