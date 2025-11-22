package baekjoon.bronze.bronze_III;

import java.util.Scanner;

public class Problem11024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            int result = 0;
            for (String s : input)
                result += Integer.parseInt(s);

            System.out.println(result);
        }
    }
}
