package baekjoon.gold.gold_IV;

import java.io.*;
import java.util.*;

public class Problem1963 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final boolean[] isPrime = new boolean[10001];
    private static final StringBuilder sb = new StringBuilder();
    private static int n;

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void solve() throws IOException {
        init();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            bfs(start, end);
        }

        print();
    }

    private static void print() throws IOException {
        bw.write(sb.toString());

        bw.close();
        br.close();
    }

    private static void bfs(int start, int end) {
        boolean[] visited = new boolean[10001];
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(start, 0));
        visited[start] = true;

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            if (node.number == end) {
                sb.append(node.depth).append("\n");
                return;
            }

            char[] tempNumberArr = String.valueOf(node.number).toCharArray();

            for (int i = 0; i < 4; i++) {
                char memory = tempNumberArr[i];

                for (char j = '0'; j <= '9'; j++) {
                    if (tempNumberArr[i] == j) continue;

                    tempNumberArr[i] = j;
                    String stringTempNumber = "";
                    for (char c : tempNumberArr)
                        stringTempNumber += c;


                    int tempNumber = Integer.parseInt(stringTempNumber);

                    if (tempNumber < 1000 || tempNumber > 9999) continue;
                    if (visited[tempNumber] || isPrime[tempNumber]) continue;

                    visited[tempNumber] = true;
                    queue.add(new Node(tempNumber, node.depth + 1));
                }

                tempNumberArr[i] = memory;
            }
        }

        sb.append("Impossible").append("\n");
    }

    private static void init() throws IOException {
        n = Integer.parseInt(br.readLine());

        isPrime[0] = true;
        isPrime[1] = true;

        for (int i = 2; i <= Math.sqrt(10000); i++) {
            if (!isPrime[i]) {
                for (int j = i * i; j <= 10000; j += i) {
                    isPrime[j] = true;
                }
            }
        }
    }

    static class Node {
        int number;
        int depth;

        public Node(int number, int depth) {
            this.number = number;
            this.depth = depth;
        }
    }
}
