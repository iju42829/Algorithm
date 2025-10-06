package baekjoon.bronze.bronze_V;

import java.util.Scanner;

public class Problem2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        for (Character c : input.toCharArray()) {
            if (Character.isLowerCase(c)) {
                System.out.print(Character.toUpperCase(c));
            } else {
                System.out.print(Character.toLowerCase(c));
            }
        }

        System.out.println();
    }
}
