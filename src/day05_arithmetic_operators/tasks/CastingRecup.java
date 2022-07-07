package day05_arithmetic_operators.tasks;

public class CastingRecup {
    public static void main(String[] args) {
        int age = 40;
        long areLong = age;

        long num = 100;
        int numInt = (int)num;

        long boxes = 3000000000L;

        float f = 14.5F;
        int i = (int)f;
        System.out.println(i);

        double d = f;
        System.out.println(d);
        double d2 = i;
        System.out.println(d2);
    }
}
