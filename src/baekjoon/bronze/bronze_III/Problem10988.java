package baekjoon.bronze.bronze_III;

import java.util.Scanner;

public class Problem10988 {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        StringBuilder sb = new StringBuilder(s);

        if (s.equals(sb.reverse().toString())) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
