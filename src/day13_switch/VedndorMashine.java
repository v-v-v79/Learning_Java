package day13_switch;

import java.util.Scanner;

public class VedndorMashine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Choose:\nSnacks\nDrinks\nType it please:");
        String iChoose = input.next();

        switch (iChoose){
            case "Snacks":
                System.out.println("Type:\n\t1-Candies,\n\t2-Cookies,\n\t3-Pretzels,\n\t4-Chips");
                int num = input.nextInt();
                switch (num){
                    case 1:
                        System.out.println("Candies has been chosen");
                        break;
                    case 2:
                        System.out.println("Cookies has been chosen");
                        break;
                    case 3:
                        System.out.println("Pretzels has been chosen");
                        break;
                    case 4:
                        System.out.println("Chips has been chosen");
                        break;
                }
                break;
            case "Drinks":
                System.out.println("Type:\n\t1-Coke,\n\t2-Fanta,\n\t3-Sprite,\n\t4-IceTea");
                int num2 = input.nextInt();
                switch (num2) {
                    case 1:
                        System.out.println("Coke has been chosen");
                        break;
                    case 2:
                        System.out.println("Fanta has been chosen");
                        break;
                    case 3:
                        System.out.println("Sprite has been chosen");
                        break;
                    case 4:
                        System.out.println("IceIea has been chosen");
                        break;
                }
                break;
        }
        input.close();
    }
}
