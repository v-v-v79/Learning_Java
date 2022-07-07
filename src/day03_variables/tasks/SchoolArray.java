package day03_variables.tasks;

public class SchoolArray {
    public static void main(String[] args) {
        int[] grades = {23, 35, 32, 25, 27};
        int sum = 0;
        int i;
        float average = 0;

        for (i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
        }
        System.out.println("Number of students in School: " + sum);
        System.out.println("Average students in class: " + (sum/grades.length));
    }
}
