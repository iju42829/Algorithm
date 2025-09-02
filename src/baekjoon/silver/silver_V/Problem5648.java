package baekjoon.silver.silver_V;

import java.util.*;

public class Problem5648 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Long> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder(String.valueOf(sc.nextLong()));

            list.add(Long.parseLong(sb.reverse().toString()));
        }

        Collections.sort(list);

        for (long l : list) {
            System.out.println(l);
        }
    }
}
