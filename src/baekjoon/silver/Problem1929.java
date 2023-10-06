package baekjoon.silver;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;

public class Problem1929 {
    private static final int N = 1000001;

    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {

            boolean[] primeNumber = new boolean[N];

            findAllPrimeNumber(primeNumber);

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            printAnswer(bw, primeNumber ,n, m);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void printAnswer(BufferedWriter bw, boolean[] primeNumber, int n, int m) throws IOException {
        for (int i = n; i <= m; i++) {
            if (!primeNumber[i]) {
                bw.write(i + "\n");
            }
        }
    }

    private static void findAllPrimeNumber(boolean[] primeNumber) {
        primeNumber[0] = true;
        primeNumber[1] = true;

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (!primeNumber[i]) {
                for (int j = i * i; j < N; j+= i) {
                    primeNumber[j] = true;
                }
            }
        }
    }
}