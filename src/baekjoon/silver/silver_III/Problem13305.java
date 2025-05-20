package baekjoon.silver.silver_III;

import java.io.*;
import java.util.*;

public class Problem13305 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int[] distanceArr = new int[n-1];
        int[] gasStationArr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n - 1; i++) {
            distanceArr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            gasStationArr[i] = Integer.parseInt(st.nextToken());
        }

        long result = (long) distanceArr[0] * gasStationArr[0];
        int minGas = gasStationArr[0];

        for (int i = 1; i < n-1; i++) {
            if (gasStationArr[i] < minGas) {
                minGas = gasStationArr[i];
            }
            result += (long) distanceArr[i] * minGas;
        }

        System.out.println(result);
    }
}
