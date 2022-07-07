package day08_if_else.tasks;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month;
        boolean isThirtyOne;
        boolean isThirty;
        boolean isTwentyEight;
        System.out.println("Enter number from 1 to 12, that represents the month:");
        month = input.nextInt();
        isThirtyOne = ((month == 1 || month == 3) | (month == 5 || month == 7)
                | (month == 8 || month == 10) | (month == 12));
        isThirty = ((month == 4 || month == 6) | (month == 9 || month == 11));
        isTwentyEight = (month == 2 );
        if (isThirtyOne) {
            System.out.println(month + "\n" + "31 days");
        }
        if (isThirty) {
            System.out.println(month + "\n" + "30 days");
        }
        if (isTwentyEight) {
            System.out.println(month + "\n" + "28 or 29 days");
        }
        if ((!isThirty && !isThirtyOne) && (!isTwentyEight)) {
            System.out.println("Wrong number");

        }
    }
}
