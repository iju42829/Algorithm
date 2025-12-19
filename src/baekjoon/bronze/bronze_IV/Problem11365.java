package baekjoon.bronze.bronze_IV;

import java.io.*;

public class Problem11365 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line  = br.readLine();
            if (line.equals("END")) break;

            StringBuilder sb = new StringBuilder(line);
            System.out.println(sb.reverse());
        }
    }
}
