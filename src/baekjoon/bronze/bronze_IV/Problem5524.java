package baekjoon.bronze.bronze_IV;

import java.io.*;

public class Problem5524 {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            System.out.println(name.toLowerCase());
        }
  }
}
