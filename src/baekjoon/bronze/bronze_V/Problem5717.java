package baekjoon.bronze.bronze_V;

import java.util.Scanner;

public class Problem5717 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int man = sc.nextInt(), woman = sc.nextInt();

            if (man == 0 && woman == 0)
                break;

            System.out.println(man + woman);
        }
    }
}
