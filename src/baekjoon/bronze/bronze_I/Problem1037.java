package baekjoon.bronze.bronze_I;

import java.util.*;

public class Problem1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println(numbers[0] * numbers[n-1]);
    }
}
