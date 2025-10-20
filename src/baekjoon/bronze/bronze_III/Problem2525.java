package baekjoon.bronze.bronze_III;

import java.util.Scanner;

public class Problem2525 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int totalTime = a * 60 + b + c;
        int hours = (totalTime / 60) % 24;
        int minutes = totalTime % 60;

        System.out.println(hours + " " + minutes);
    }
}
