package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem15873 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int a = 0, b = 0;

        if (s.length() == 2) {
            a = s.charAt(0) - '0';
            b = s.charAt(1) - '0';
        } else if (s.length() == 3) {
            if (s.startsWith("10")) {
                a = 10;
                b = s.charAt(2) - '0';
            } else {
                a = s.charAt(0) - '0';
                b = 10;
            }
        } else if (s.length() == 4) {
            a = 10;
            b = 10;
        }

        System.out.println(a + b);
    }
}
