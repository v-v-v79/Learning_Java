package day08_if_else.tasks;

import java.util.Scanner;

public class TimeOfTheDay {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter time, just hours (24 hr format):");
        int time = input.nextInt();
        if (time > 0 && time < 12) {
            System.out.println("Good Morning!");
        }
        if (time > 11 && time < 17) {
            System.out.println("Good Day!");
        }
        if (time > 17 && time < 24) {
            System.out.println("Good Night!");
        }
        else {
            System.out.println("You entered wrong time");
        }
    }
}
