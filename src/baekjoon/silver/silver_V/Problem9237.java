package baekjoon.silver.silver_V;

import java.util.*;

public class Problem9237 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[] trees = new Integer[n];
        for (int i = 0; i < n; i++) {
            trees[i] = sc.nextInt();
        }

        Arrays.sort(trees, Comparator.reverseOrder());

        int answer = 0;

        for (int i = 0; i < n; i++) {
            trees[i] = i + 1 + trees[i];
            answer = Math.max(answer, trees[i]);
        }

        System.out.println(answer + 1);
    }
}
