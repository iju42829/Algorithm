package baekjoon.bronze.bronze_I;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem1934 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt();

            BigInteger tempA = BigInteger.valueOf(a);
            BigInteger tempB = BigInteger.valueOf(b);

            BigInteger lcm = tempA.multiply(tempB).divide(tempA.gcd(tempB));
            System.out.println(lcm);
        }
    }
}
