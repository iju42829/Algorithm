package baekjoon.bronze.bronze_I;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem9506 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == -1) break;

            List<Integer> temp = new ArrayList<>();
            int sum = 0;

            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    temp.add(i);
                    sum += i;
                }
            }

            if (sum != n) {
                System.out.println(n + " is NOT perfect.");
            }
            else {
                System.out.print(n + " = ");
                for (int i = 0; i < temp.size(); i++) {
                    System.out.print(temp.get(i));
                    if (i != temp.size() - 1)
                        System.out.print(" + ");
                }
                System.out.println();
            }
        }
    }
}
