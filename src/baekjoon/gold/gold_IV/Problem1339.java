package baekjoon.gold.gold_IV;

import java.io.*;
import java.util.*;

public class Problem1339 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final Map<Character, Integer> map = new HashMap<>();
    private static final Map<Character, Integer> resultMap = new HashMap<>();
    private static String[] words;
    private static int n;

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void solve() throws IOException {
        init();

        String[] changeNumber = new String[n];

        for (int i = 0; i < n; i++) {
            String word = words[i];

            StringBuilder sb = new StringBuilder();

            for (char c : word.toCharArray()) {
                int result = resultMap.get(c);

                sb.append(result);
            }

            changeNumber[i] = sb.toString();
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            result += Integer.parseInt(changeNumber[i]);
        }

        bw.write(result + "\n");
        bw.close();
        br.close();
    }

    private static void init() throws IOException {
        n = Integer.parseInt(br.readLine());
        words = new String[n];

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            words[i] = word;

            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                int weight = (int) Math.pow(10, word.length() - j - 1);

                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + weight);
                } else {
                    map.put(c, weight);
                }
            }
        }

        List<Word> list = new ArrayList<>();

        for (Character key : map.keySet()) {
            int count = map.get(key);

            list.add(new Word(key, count));
        }

        Collections.sort(list);

        int index = 9;

        for (Word word : list) {
            resultMap.put(word.c, index);
            index--;
        }
    }

    static class Word implements Comparable<Word> {
        char c;
        int count;

        public Word(char c, int count) {
            this.c = c;
            this.count = count;
        }

        @Override
        public int compareTo(Word o) {
            return o.count - this.count;
        }
    }
}
