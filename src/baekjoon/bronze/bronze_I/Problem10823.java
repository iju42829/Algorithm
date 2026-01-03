package baekjoon.bronze.bronze_I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem10823 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringBuilder sb = new StringBuilder();
    String line;

    while ((line = br.readLine()) != null) {
      sb.append(line);
    }

    long sum = 0;

    for (String s : sb.toString().split(",")) {
      sum += Long.parseLong(s); 
    }

    System.out.println(sum);
  }
}
