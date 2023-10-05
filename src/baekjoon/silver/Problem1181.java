package baekjoon.silver;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Comparator;

public class Problem1181 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        try (BufferedReader br = new BufferedReader
                (new InputStreamReader(System.in, StandardCharsets.UTF_8));
             BufferedWriter bw = new BufferedWriter
                     (new OutputStreamWriter(System.out, StandardCharsets.UTF_8))) {

            int n = Integer.parseInt(br.readLine());
            String[] words = new String[n];

            for (int i = 0; i < n; i++) {
                words[i] = br.readLine();
            }

            Arrays.sort(words, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    if (o1.length() == o2.length()) {
                        return o1.compareTo(o2);
                    }

                    else {
                        return o1.length() - o2.length();
                    }
                }
            });

            bw.write(words[0] + "\n");

            for (int i = 1; i < n; i++) {
                if (words[i].equals(words[i-1])) {
                    continue;
                }

                bw.write(words[i] + "\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}