package day07_scanner.tasks;

import java.util.Scanner;

public class PatientInfo {
    public static void main(String[] args) {
        //Enter your code here
        String  firstName, lastName, email, street, state, city;
        int     age, zipCode;
        double  height, weight;
        boolean isMarried;
        long    workPhoneNumber, personalPhoneNumber;
        Scanner scan = new Scanner(System.in);

        // this part is already provided DO NOT CHANGE
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        firstName = scan.next();
        //scan.nextLine();
        System.out.println("Enter your last name");
        lastName = scan.next();
        //scan.nextLine();
        System.out.println("Enter your email");
        email = scan.next();
        //scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        street = scan.nextLine();
        System.out.println("Enter your city");
        city = scan.next();
        scan.nextLine();
        System.out.println("Enter your state");
        state = scan.next();
        //scan.nextLine();
        System.out.println("Enter your zip code");
        zipCode = scan.nextInt();
        //scan.nextLine();
        System.out.println("Enter your work phone number");
        workPhoneNumber = scan.nextLong();
        //scan.nextLine();
        System.out.println("Enter your personal phone number");
        personalPhoneNumber = scan.nextLong();
        //scan.nextLine();
        System.out.println("Enter your age");
        age = scan.nextInt();
        //scan.nextLine();
        System.out.println("Enter your height");
        height = scan.nextDouble();
        //scan.nextLine();
        System.out.println("Enter your weight");
        weight = scan.nextDouble();
        //scan.nextLine();
        System.out.println("Are you married?");
        isMarried = scan.nextBoolean();
        //scan.nextLine();

        String contact = "Contact: work phone number: " + workPhoneNumber + ", personal phone number: " +     personalPhoneNumber + ", email: " + email;
        String fullName = "Full name: " + firstName + " " + lastName;
        String address  = "Address: " + street + ", " + city + ", " + state + " " + zipCode;

        System.out.println("Patient personal information\n"  + fullName + "\n" + address + "\n" + contact + "\nAge: " + age + "\nHeight: " + height + "\nWeight: " + weight + " pounds\nMarried: " + isMarried);

        // continue for city


    }
}
