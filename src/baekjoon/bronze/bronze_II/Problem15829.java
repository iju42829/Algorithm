package baekjoon.bronze.bronze_II;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Problem15829 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            String string = br.readLine();
            BigInteger bigInteger = new BigInteger("0");


            for (int i = 0; i < n; i++) {
                bigInteger = bigInteger
                        .add(BigInteger.valueOf(string.charAt(i) - 96)
                                .multiply(BigInteger.valueOf(31).pow(i)));
            }

            System.out.println(bigInteger.remainder(BigInteger.valueOf(1234567891)));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}