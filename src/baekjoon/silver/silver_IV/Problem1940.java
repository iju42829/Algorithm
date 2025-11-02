package baekjoon.silver.silver_IV;

import java.util.*;

public class Problem1940 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        int left = 0, right = n - 1, count = 0;

        while (left < right) {
            int temp = numbers[left] + numbers[right];

            if (temp == m) {
                left++;
                right--;
                count++;
            } else if (temp < m) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(count);
    }
}
