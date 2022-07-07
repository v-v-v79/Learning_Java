package day11_if_nested.tasks;

import java.util.Scanner;

public class SoccerGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter game time in minutes:");
        int timeLeft = input.nextInt();

        if(timeLeft >= 0 && timeLeft <= 90){

            if(timeLeft >= 60)
                System.out.println("Game is just started");
            else if(timeLeft >= 30)
                System.out.println("Middle of the game");
            else
                System.out.println("The end of the game is approaching");
        }
        else{

            if (timeLeft < 0)
                System.out.println("wrong input, negative digit");
            else
                System.out.println("Game cant be longer than 90 minutes");
        }

    }
}
