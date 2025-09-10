package baekjoon.bronze.bronze_III;

import java.io.*;
import java.util.*;

public class Problem2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = 0;

            for (int j = 0; j < 4; j++) {
                if (st.nextToken().equals("0"))
                    count++;
            }

            char result;

            switch (count) {
                case 1: result = 'A'; break;
                case 2: result = 'B'; break;
                case 3: result = 'C'; break;
                case 4: result = 'D'; break;
                default: result = 'E'; break;
            }

            System.out.println(result);
        }
    }
}
