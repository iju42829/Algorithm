package baekjoon.gold.gold_III;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Problem1644 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final int IS_PRIME_SIZE = 4000001;
    private static final boolean[] isPrime = new boolean[IS_PRIME_SIZE];
    private static final List<Integer> primes = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        init();
        int result = solve();

        bw.write(result + "\n");

        bw.close();
        br.close();
    }

    private static int solve() throws IOException {
        int count = 0;
        int n = Integer.parseInt(br.readLine());

        int lt = 0, rt = 0, sum = 0;

        while(true) {
            if (sum == n) {
                count++;
            }

            if (sum >= n) {
                sum -= primes.get(lt++);
            } else {
                if (rt == primes.size())
                    break;
                sum += primes.get(rt++);
            }
        }

        return count;
    }

    private static void init() {
        isPrime[0] = true;
        isPrime[1] = true;

        for (int i = 2; i < Math.sqrt(IS_PRIME_SIZE); i++) {
            if (!isPrime[i]) {
                for (int j = i * i; j < IS_PRIME_SIZE; j += i) {
                    isPrime[j] = true;
                }
            }
        }

        for (int i = 0; i < IS_PRIME_SIZE; i++) {
            if (!isPrime[i])
                primes.add(i);
        }
    }
}
