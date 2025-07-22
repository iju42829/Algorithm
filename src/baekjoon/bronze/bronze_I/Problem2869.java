package baekjoon.bronze.bronze_I;

import java.util.Scanner;

public class Problem2869 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();

        int rs = (v - b) / (a - b);

        if ((v - b) % (a - b) != 0)
            rs++;
        System.out.println(rs);
    }
}
