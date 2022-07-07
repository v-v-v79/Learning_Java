package day11_if_nested.tasks;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter grade:");

        int grade = input.nextInt();
        input.close();

        if(grade > 0 && grade < 19) {
            if (grade >= 1 && grade < 6)
                System.out.println("Elementary School.");
            else if (grade > 5 && grade < 9)
                System.out.println("Middle School.");
            else if (grade > 8 && grade < 13)
                System.out.println("High school.");
            else if (grade > 12 && grade < 17)
                System.out.println("College");
            else
                System.out.println("Grad School.");
        }
        else
            System.out.println("Wrong input.");
    }
}
