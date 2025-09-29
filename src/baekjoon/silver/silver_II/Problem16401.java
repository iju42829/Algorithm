package baekjoon.silver.silver_II;

import java.io.*;
import java.util.*;

public class Problem16401 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());

        int[] cookies = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            cookies[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cookies);

        int lt = 1, rt = cookies[n-1], answer = 0;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            int count = 0;

            for (int cookie : cookies) {
                count += cookie / mid;
            }

            if (count >= m) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }

        bw.write(answer + "\n");
        bw.close();
        br.close();
    }
}
