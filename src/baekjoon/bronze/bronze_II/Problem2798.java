package baekjoon.bronze.bronze_II;

import java.io.*;
import java.util.StringTokenizer;

public class Problem2798 {
    private static int n;
    private static int k;
    private static int result = Integer.MIN_VALUE;
    private static int[] card;
    private static int[] selectedCard = new int[3];

    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            card = new int[n];

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                card[i] = Integer.parseInt(st.nextToken());
            }

            dfs(0, 0);

            bw.write(result + "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void dfs(int depth, int start) {
        if (depth == 3) {
            int temp = 0;

            for (int card : selectedCard){
                temp += card;
            }

            if (temp <= k) {
                result = Math.max(result, temp);
            }

            return;
        }

        for (int i = start; i < n; i++) {
            selectedCard[depth] = card[i];
            dfs(depth + 1, i + 1);
        }

    }
}
