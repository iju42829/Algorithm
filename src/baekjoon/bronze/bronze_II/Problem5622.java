package baekjoon.bronze.bronze_II;

import java.util.Scanner;

public class Problem5622 {
    public static void main(String[] args) {
        int[] time = {3,3,3, 4,4,4, 5,5,5, 6,6,6, 7,7,7, 8,8,8,8, 9,9,9, 10,10,10,10};

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int answer = 0;
        for (char c : input.toCharArray()) {
            answer += time[c - 'A'];
        }

        System.out.println(answer);
    }
}
