package day06_operators.tasks;

public class CreditScore {
    public static void main(String[] args) {
        double salary = 80_000D;
        int creditScore = 720;
        boolean youApproved = salary >= 100000 && creditScore >= 720;
        boolean youApproved2 = salary >= 80000 && creditScore >= 780;

        boolean canGetLoan = youApproved2 || youApproved;

        System.out.println("You are approved: " + canGetLoan);
    }
}
