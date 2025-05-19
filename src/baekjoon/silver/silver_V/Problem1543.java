package baekjoon.silver.silver_V;

import java.io.*;

public class Problem1543 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        char[] word = br.readLine().toCharArray();
        char[] check = br.readLine().toCharArray();

        boolean[] visited = new boolean[word.length];
        int count = 0;

        for (int i = 0; i <= word.length - check.length; i++) {

            boolean flag = true;
            for (int j = 0; j < check.length; j++) {
                if (word[i + j] == check[j] && !visited[i+j]) continue;
                else {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                for (int j = 0; j < check.length; j++)
                    visited[i+j] = true;
                count++;
            }
        }

        bw.write(count + "\n");

        bw.close();
        br.close();
    }
}
