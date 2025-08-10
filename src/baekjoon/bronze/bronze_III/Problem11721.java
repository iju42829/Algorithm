package baekjoon.bronze.bronze_III;

import java.util.Scanner;

public class Problem11721 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        for (int i = 0; i < word.length(); i += 10) {
            int t = Math.min(i + 10, word.length());
            System.out.println(word.substring(i, t));
        }
    }
}
