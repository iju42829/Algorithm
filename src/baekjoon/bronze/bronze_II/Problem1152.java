package baekjoon.bronze.bronze_II;

import java.util.Scanner;

public class Problem1152 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();

        if (line.isEmpty())
            System.out.println(0);
        else
            System.out.println(line.split(" ").length);
    }
}
