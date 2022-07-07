package day07_scanner.tasks;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int cases = sc.nextInt();
        String []str = new String[cases];
        for(int i=0;i<cases;i++){
            str[i]=sc.next();
        }
    }
}
