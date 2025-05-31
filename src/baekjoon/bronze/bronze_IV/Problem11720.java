package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();

        int answer = 0;
        for (char c : input.toCharArray()) {
            answer += c - '0';
        }

        System.out.println(answer);
    }
}
