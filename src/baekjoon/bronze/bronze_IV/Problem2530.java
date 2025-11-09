package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem2530 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();

        int totalSeconds = a * 3600 + b * 60 + c + d;

        totalSeconds %= 86400;

        int hours = totalSeconds / 3600;
        totalSeconds %= 3600;
        int minute = totalSeconds / 60;
        int second = totalSeconds % 60;

        System.out.println(hours + " " + minute + " " + second);
    }
}
