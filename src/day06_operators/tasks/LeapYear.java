package day06_operators.tasks;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2022;
        boolean isLeapYear = year % 4 == 0;

        System.out.println("2022 is a leap year: " + isLeapYear);
    }
}
