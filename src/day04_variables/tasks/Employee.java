package day04_variables.tasks;

public class Employee {
    public static void main(String[] args) {
        String firstName, lastName, companyName, jobTitle, employeeID;
        int numberOfPTO;
        double salary;
        boolean isFoolTime;
        char suite;

        firstName = "James";
        lastName = "Bond";
        companyName = "M16";
        jobTitle = "Secret Agent";
        employeeID = "J11";
        suite = 'C';
        isFoolTime = true;
        numberOfPTO = 15;
        salary = 1_000_000.00;

        String fullName = firstName + " " + lastName;
        String eMail = firstName + employeeID + "@" + companyName + ".com";
        String benefits = "$" + salary + " salary a yer, " + numberOfPTO + " PTO days and WFH.";
        String summary = "Employee Information for " + fullName + ". \n" + jobTitle + " for "
                + companyName + ", based in suite " + suite + ".\nMr/Mrs " + lastName +
                " is full time " + isFoolTime + ".\nContact Mr/Mrs " + lastName + " at " + eMail +
                ".\nCurrent benefits include " + benefits;

//        System.out.println(fullName + "\n" + eMail + "\n" + benefits);
        System.out.println(summary);
    }

}
