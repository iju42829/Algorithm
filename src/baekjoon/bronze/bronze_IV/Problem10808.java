package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int[] result = new int[26];

        for (char c : input.toCharArray())
            result[c - 'a']++;

        for (int i : result)
            System.out.print(i + " ");
        System.out.println();
    }
}
