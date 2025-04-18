package baekjoon.silver.silver_IV;

import java.io.*;
import java.util.*;

public class Problem1302 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int n;

    public static void main(String[] args) throws IOException{
        solve();
    }

    private static void solve() throws IOException {
        Map<String, Integer> map = new HashMap<>();
        PriorityQueue<Word> pq = new PriorityQueue<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            map.put(input, map.getOrDefault(input, 0) + 1);
        }

        for (String key : map.keySet()) {
            int count = map.get(key);

            pq.add(new Word(key, count));
        }

        bw.write(pq.poll().word + "\n");
        bw.close();
        br.close();
    }

    static class Word implements Comparable<Word> {
        String word;
        int count;

        public Word(String word, int count) {
            this.word = word;
            this.count = count;
        }

        @Override
        public int compareTo(Word word) {
            if (this.count == word.count) {
                return this.word.compareTo(word.word);
            }
            return word.count - this.count;
        }
    }
}
