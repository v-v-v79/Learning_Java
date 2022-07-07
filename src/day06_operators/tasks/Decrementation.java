package day06_operators.tasks;

public class Decrementation {
    public static void main(String[] args) {

        int a = 8;
        int b = a--;

        System.out.println(a);
        System.out.println(b);

        a = b;
        b = a++;

        System.out.println(a);
        System.out.println(b);
    }
}
