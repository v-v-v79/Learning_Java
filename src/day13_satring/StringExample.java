package day13_satring;

public class StringExample {
    public static void main(String[] args) {
        String str1 = "First";
        String str2 = "Second";
        String str3 = "First";
        String str4 = new String("First");
        String str5 = new String("First");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);
        System.out.println(str4 == str5);
    }
}
