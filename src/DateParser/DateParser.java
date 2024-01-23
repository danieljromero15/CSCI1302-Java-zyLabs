package DateParser;

import java.util.ArrayList;
import java.util.Scanner;

public class DateParser {
    public static int getMonthAsInt(String monthString) {
        int monthInt;

        // Java switch/case statement
        switch (monthString) {
            case "January":
                monthInt = 1;
                break;
            case "February":
                monthInt = 2;
                break;
            case "March":
                monthInt = 3;
                break;
            case "April":
                monthInt = 4;
                break;
            case "May":
                monthInt = 5;
                break;
            case "June":
                monthInt = 6;
                break;
            case "July":
                monthInt = 7;
                break;
            case "August":
                monthInt = 8;
                break;
            case "September":
                monthInt = 9;
                break;
            case "October":
                monthInt = 10;
                break;
            case "November":
                monthInt = 11;
                break;
            case "December":
                monthInt = 12;
                break;
            default:
                monthInt = 0;
        }

        return monthInt;
    }

    public static void printArrayList(ArrayList<String> array) {
        for (int i = 0; i < array.size(); ++i) {
            System.out.println(array.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // TODO: Read dates from input, parse the dates to find the ones
        //       in the correct format, and output in m-d-yyyy format
        String month = "";
        int day;
        int year;

        ArrayList<String> dates = new ArrayList<>();

        while (!(month.equals("-1"))) { // month is not -1
            month = scan.next();

            int monthInt = getMonthAsInt(month);
            if (monthInt > 0) {
                // continue
                //System.out.println(monthInt);
                String dayAndMonth = scan.nextLine();
                String commaCheck;

                //System.out.println(dayAndMonth);
                try {
                    day = Integer.parseInt(dayAndMonth.substring(1, 3)); // 2 length day
                    commaCheck = dayAndMonth.substring(3, 4);
                } catch (Exception e) {
                    day = Integer.parseInt(dayAndMonth.substring(1, 2)); // 1 length day
                    commaCheck = dayAndMonth.substring(2, 3);
                }
                if (commaCheck.equals(",")) {
                    //System.out.println(day);

                    year = Integer.parseInt(dayAndMonth.substring(dayAndMonth.length() - 4, dayAndMonth.length()));
                    //System.out.println(year);

                    String date = monthInt + "-" + day + "-" + year;

                    dates.add(date);
                }

            }
        }
        printArrayList(dates);
    }
}