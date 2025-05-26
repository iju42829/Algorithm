package baekjoon.bronze.bronze_II;

import java.io.*;

public class Problem5585 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int change = 1000 - n;

        int[] coins = {500, 100, 50, 10, 5, 1};
        int count = 0;

        for (int coin : coins) {
            count += change / coin;
            change %= coin;
        }

        System.out.println(count);
    }
}
