package day07_scanner.tasks;

import  java.util.Scanner;

public class HourlyRate {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter salary:");
        double salary = input.nextInt();
        System.out.println("Enter hours per week:");
        int hours = input.nextInt();

        System.out.println("Your hourly rate is: " + salary/(hours*52));

    }
}
