package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem14489 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong();

        long total = a + b;
        long price = 2 * c;

        if (total >= price) {
            System.out.println(total - price);
        } else {
            System.out.println(total);
        }
    }
}
