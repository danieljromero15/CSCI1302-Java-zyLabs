package rightFacingArrow;

import java.util.Scanner;

public class rightFacingArrow { //zybooks is LabProgram
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int baseChar;
      int headChar;
      
      baseChar = scnr.nextInt();
      headChar = scnr.nextInt();

      System.out.println("     " + printRepeat(headChar, 1));
      System.out.println("     " + printRepeat(headChar, 2));
      System.out.println(printRepeat(baseChar, 5) + printRepeat(headChar, 3));
      System.out.println(printRepeat(baseChar, 5) + printRepeat(headChar, 4));
      System.out.println(printRepeat(baseChar, 5) + printRepeat(headChar, 3));
      System.out.println("     " + printRepeat(headChar, 2));
      System.out.println("     " + printRepeat(headChar, 1));

      scnr.close();
   }
   public static String printRepeat(int Char, int n){
      String result = "";
      for(int i=0; i<n; ++i){
         result = result + Char;
      }
      return result;
   }
}
