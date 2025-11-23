package baekjoon.bronze.bronze_II;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem2998 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.nextLine();

        BigInteger num = new BigInteger(binary, 2);
        String octal = num.toString(8);

        System.out.println(octal);
    }
}
