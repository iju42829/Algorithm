package baekjoon.bronze.bronze_IV;

import java.io.*;

public class Problem26742 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long cntB = 0, cntC = 0;

    for (char c : br.readLine().toCharArray()) {
      if (c == 'B') cntB++;
      else if (c == 'C') cntC++;
    }

    long result = (cntB / 2) + (cntC / 2);
    System.out.println(result);
  }
}
