package baekjoon.silver.silver_III;

import java.io.*;
import java.util.*;

public class Problem20920 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final PriorityQueue<Word> pq = new PriorityQueue<>();
    private static final Map<String, Integer> map = new HashMap<>();
    private static int n, m;

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void solve() throws IOException {
        init();

        for (String key : map.keySet()) {
            pq.add(new Word(key, map.get(key)));
        }

        while (!pq.isEmpty()) {
            bw.write(pq.poll().word + "\n");
        }

        bw.close();
        br.close();
    }

    private static void init() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            if (input.length() >= m) {
                map.put(input, map.getOrDefault(input, 0) + 1);
            }
        }
    }

    static class Word implements Comparable<Word> {
        String word;
        int count;

        public Word(String word, int count) {
            this.word = word;
            this.count = count;
        }

        @Override
        public int compareTo(Word o) {
            if (this.count != o.count) {
                return o.count - this.count;
            } else {
                if (this.word.length() != o.word.length()) {
                    return o.word.length() - this.word.length();
                }
                return this.word.compareTo(o.word);
            }
        }
    }
}
