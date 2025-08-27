package baekjoon.bronze.bronze_II;

import java.util.Scanner;

public class Problem8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String inputs = sc.nextLine();

            int answer = 0;
            int count = 1;

            for (char c : inputs.toCharArray()) {
                if (c == 'O') {
                    answer += count;
                    count++;
                } else {
                    count = 1;
                }
            }

            System.out.println(answer);
        }
    }
}
