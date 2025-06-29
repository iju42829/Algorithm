package baekjoon.bronze.bronze_II;

import java.util.*;

public class Problem10809 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int[] words = new int[26];

        Arrays.fill(words, -1);

        for (int i = 0; i < input.length(); i++) {
            int idx = input.charAt(i) - 'a';
            if (words[idx] == -1) {
                words[idx] = i;
            }
        }

        for (int i : words)
            System.out.print(i + " ");
        System.out.println();
    }
}
