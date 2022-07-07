package day09_ternary;

public class TernaryExample {
    public static void main(String[] args) {

        int score = 80;
        String result = score > 70 ? "Passing" : "Failing";
        System.out.println(result);

        int num = 9;
        System.out.println(num % 2 == 0 ? "even" : "odd");

        boolean isGreen = false;
        System.out.println(isGreen ? "Drive" : "Stop");

        int num2 = 10;
        System.out.println(num2 > 0 ? "Positive" : num2 < 0 ? "Negative" : "Zero");
    }
}
