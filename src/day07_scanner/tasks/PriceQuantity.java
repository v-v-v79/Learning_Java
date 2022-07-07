package day07_scanner.tasks;

import java.util.Scanner;

public class PriceQuantity {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Type price:");
        double price = input.nextInt();

        System.out.println("Type quantity:");
        int quantity = input.nextInt();

        System.out.println("Revenue is: " + (price * quantity));
    }
}
