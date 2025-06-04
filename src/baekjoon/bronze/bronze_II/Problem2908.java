package baekjoon.bronze.bronze_II;

import java.util.Scanner;

public class Problem2908 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        StringBuilder aStringBuilder = new StringBuilder(a);
        StringBuilder bStringBuilder = new StringBuilder(b);

        int aResult = Integer.parseInt(aStringBuilder.reverse().toString());
        int bResult = Integer.parseInt(bStringBuilder.reverse().toString());

        System.out.println(Math.max(aResult, bResult));

    }
}
