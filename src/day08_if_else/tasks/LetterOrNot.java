package day08_if_else.tasks;

import java.util.Scanner;

public class LetterOrNot {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter any character:");

        char letter = input.next().charAt(0);

        if ((letter > 3 && letter < 48) | (letter > 57 && letter < 65) | (letter > 90 && letter < 97)
            | (letter > 122 && letter < 127)) {
            System.out.println("\"" + letter + "\" is a special character.");
        }
        if (letter > 47 && letter < 58) {
            System.out.println("\"" + letter + "\" is a number.");
        }
        if ((letter > 64 && letter < 91) | (letter > 96 && letter < 123)) {
            System.out.println("\"" + letter + "\" is a letter.");
        }
    }
}
