package day05_arithmetic_operators.tasks;

public class SalaryCalc {
    public static void main(String[] args) {
        double salary = 100_000;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;
        double stateTax, federalTax, totalTax, salaryAfterTax;
        stateTax = salary * stateTaxRate;
        federalTax = salary * federalTaxRate;
        totalTax = stateTax + federalTax;
        salaryAfterTax = salary - totalTax;

        String taxReport = "| Salary " + salary + " | State tax rate: " + stateTaxRate + " | Federal tax rate " + federalTaxRate
                + "\nState tax: " + stateTax + " | Federal tax: " + federalTax + " | Toyal tax: " + totalTax + "\nTooal salary after taxes $" + salaryAfterTax;

        System.out.println(taxReport);

    }
}
