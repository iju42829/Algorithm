package baekjoon.silver.silver_V;

import java.util.*;

public class Problem16435 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), l = sc.nextInt();
        int[] fruits = new int[n];

        for (int i = 0; i < n; i++) {
            fruits[i] = sc.nextInt();
        }

        Arrays.sort(fruits);

        for (int fruit : fruits) {
            if (fruit <= l) {
                l++;
            } else {
                break;
            }
        }

        System.out.println(l);
    }
}
