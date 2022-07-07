package day08_if_else.tasks;

import java.util.Scanner;

public class BiggerOfThree {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter first number:");

        num1 = input.nextInt();
        System.out.println("Enter second number:");
        num2 = input.nextInt();
        System.out.println("Enter third number:");
        num3 = input.nextInt();

        if(num1 > num2 && num1 > num3) {
            System.out.println("First number " + num1 +  " is biggest.");
            }
        if (num2 > num1 && num2 > num3) {
            System.out.println("Second number " + num2 +  " is biggest.");
        }
        if (num3 > num2 && num3 > num1) {
            System.out.println("Third number " + num3 +  " is biggest.");
        }
        else {
            System.out.println("Numbers are equal.");
        }
    }
}
