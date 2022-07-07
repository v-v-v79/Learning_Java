package day07_scanner.tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TriangleCircle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter three angles:");

        int angleOne = input.nextInt();
        int angleTwo = input.nextInt();
        int angleThree = input.nextInt();

        boolean triangle = angleOne + angleTwo + angleThree == 180;
        boolean circle = angleOne + angleTwo + angleThree == 360;

        System.out.println("It is triangle: " + triangle);
        System.out.println("It is circle: " + circle);
    }
}
