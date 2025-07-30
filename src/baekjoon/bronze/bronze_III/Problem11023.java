package baekjoon.bronze.bronze_III;

import java.util.Scanner;

public class Problem11023 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for (String s : sc.nextLine().split(" ")) {
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}
