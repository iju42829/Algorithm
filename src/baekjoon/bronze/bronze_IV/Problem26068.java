package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem26068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            int days = Integer.parseInt(sc.nextLine().substring(2));
            if (days <= 90)
                count++;
        }

        System.out.println(count);
    }
}
