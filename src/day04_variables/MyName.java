package day04_variables;

public class MyName {
    public static void main(String[] args) {
        int first = 'S';
//        int asciiValue = first;
//        char second = 'l';
//        char third = 'a';
//        char fourth = 'v';
//        char fifth = 'a';
        char [] name = {'S', 'l', 'a', 'v', 'a'};
        for(int i = 0; i < name.length; i++) {
            System.out.print(Character.getNumericValue(name[i]) + " ");

        }
        System.out.println(Character.getNumericValue(first));
        System.out.println(first);

//        System.out.println(first + second + third + fourth + fifth);
//        System.out.println("name is: " + first + second + third + fourth + fifth); //concatenation
//        System.out.print(first);
//        System.out.print(second);
//        System.out.print(third);
//        System.out.print(fourth);
//        System.out.print(fifth);
//        System.out.printf(Character.getNumericValue(i));
    }
}
