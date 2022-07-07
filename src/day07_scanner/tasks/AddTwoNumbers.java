package day07_scanner.tasks;
import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Type first number:");
        int numberOne = input.nextInt();

        System.out.println("Type second number:");
        int numberTwo = input.nextInt();

        System.out.println(numberOne);
        System.out.println(numberTwo);
    }
}
