package baekjoon.silver.silver_V;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem5347 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            BigInteger bigA = BigInteger.valueOf(a);
            BigInteger bigB = BigInteger.valueOf(b);

            System.out.println(a * b / bigA.gcd(bigB).longValue());
        }
    }
}
