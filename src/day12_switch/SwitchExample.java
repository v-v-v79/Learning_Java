package day12_switch;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter word:");
        String day = input.next();
        switch (day) {
            case "Monday":
            case "monday":
            case "MONDAY":
                System.out.println("понедельник");
                break;
        }

    }
}
