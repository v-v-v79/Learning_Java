package day03_variables.tasks;

public class Olympics {
    public static void main(String[] args) {
        int year = 2022;
        int i = 0;
        String [] countries = {"China", "France", "Italy"};

        System.out.println("Olympic Games years - location:");

        while (year <= 2026) {
            System.out.printf("\t\t\t   %d - %s\n", year, countries[i]);
            year = year + 2;
            countries[i] = countries[i+1];
        }
    }
}
