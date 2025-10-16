package baekjoon.bronze.bronze_V;

import java.util.Scanner;

public class Problem25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = n / 4;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append("long ");
        }
        sb.append("int");

        System.out.println(sb.toString());
    }
}
