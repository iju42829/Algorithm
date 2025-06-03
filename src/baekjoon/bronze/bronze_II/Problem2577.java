package baekjoon.bronze.bronze_II;

import java.util.Scanner;

public class Problem2577 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = a * b * c;

        int[] resultArr = new int[10];

        for (char t : String.valueOf(result).toCharArray()) {
            resultArr[t - '0']++;
        }

        for (int i : resultArr)
            System.out.println(i);
    }
}
