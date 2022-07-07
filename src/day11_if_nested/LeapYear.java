package day11_if_nested;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        System.out.println("Enter the month: ");
        int num = sc.nextInt();
        sc.close();

        String res = "";
        //create an if statement to validate if the month input falls within range

        boolean inRange = num >= 1 && num <= 12,
                isLeapYr = year % 4 == 0;

        if (inRange) {
            if (num == 2)
                res = (isLeapYr) ? "29 Days" : "28 Days";
            else if (num == 4 || num == 6 || num == 9 || num == 11)
                res = "30 days";
            else
                res = "31 Days.";
        } else
            res = "Invalid Input";
        System.out.println(res);
    }
}
