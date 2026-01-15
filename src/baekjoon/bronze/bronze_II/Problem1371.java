package baekjoon.bronze.bronze_II;

import java.io.*;

public class Problem1371 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] cnt = new int[26];
    String line;

    while((line = br.readLine()) != null) {
      for (int i = 0; i < line.length(); i++) {
        char ch = line.charAt(i);

        if (ch >= 'a' && ch <= 'z')
          cnt[ch - 'a']++;
      }
    }

    int max = 0;
    for (int i = 0; i < 26; i++) {
      if (cnt[i] > max) max = cnt[i];
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 26; i++) {
      if (cnt[i] == max) 
        sb.append((char)('a' + i));
    }

    System.out.print(sb.toString());
  }
}
