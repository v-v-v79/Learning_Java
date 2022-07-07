package day09_ternary;

import java.util.Scanner;

public class VehicleRecall {
    public static void main(String[] args) {
        // DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        System.out.println("Enter vehicle's year:");
        int vehicleYear = input.nextInt();

        //WRITE YOUR CODE BELOW:
        if (vehicleYear < 1999 && vehicleYear > 1994)
            System.out.println("Your vehicle needs to be recalled!");
        else if (vehicleYear < 2003 && vehicleYear > 2000)
        System.out.println("Your vehicle needs to be recalled!");
		else if (vehicleYear < 2007 && vehicleYear > 2003)
        System.out.println("Your vehicle needs to be recalled!");
		else if (vehicleYear < 2018 && vehicleYear > 2014)
        System.out.println("Your vehicle needs to be recalled!");
		else
        System.out.println("Your vehicle is fine, enjoy!");
    }
}
