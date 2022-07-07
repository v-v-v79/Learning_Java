package day03_variables.tasks;

public class School {
    public static void main(String[] args) {
        int grade1, grade2, grade3, grade4, grade5;
        grade1 = 27;
        grade2 = 31;
        grade3 = 24;
        grade4 = 29;
        grade5 = 21;

        System.out.println(Integer.sum(grade1, grade2) + Integer.sum(grade3,grade4) + grade5);
    }
}
