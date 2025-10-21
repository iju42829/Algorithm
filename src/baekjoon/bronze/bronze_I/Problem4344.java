package baekjoon.bronze.bronze_I;

import java.util.Scanner;

public class Problem4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();

        for (int i = 0; i < c; i++) {
            int n = sc.nextInt();
            int[] scores = new int[n];
            int sum = 0;
            for (int j = 0; j < n; j++) {
                scores[j] = sc.nextInt();
                sum += scores[j];
            }

            double avg = (double) sum / n;
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (scores[j] > avg)
                    count++;
            }

            double answer = (double) count / n * 100;

            System.out.printf("%.3f%%\n", answer);
        }
    }
}
