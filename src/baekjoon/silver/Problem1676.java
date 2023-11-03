package baekjoon.silver;

import java.io.*;
import java.math.BigInteger;

public class Problem1676 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int n = Integer.parseInt(br.readLine());

            bw.write(factorial(n) + "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int factorial(int n) {
        BigInteger bigInteger = new BigInteger("1");
        int result = 0;

        for (int i = 2; i <= n; i++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }

        String number = String.valueOf(bigInteger);

        for (int i = number.length() - 1; i >= 0; i--) {
            if (number.charAt(i) - '0' == 0) {
                result++;
            }

            else {
                return result;
            }
        }

        return result;
    }
}