package baekjoon.bronze.bronze_III;

import java.util.Scanner;

public class Problem10953 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] inputs = sc.nextLine().split(",");

            System.out.println(Integer.parseInt(inputs[0]) + Integer.parseInt(inputs[1]));
        }
    }
}
