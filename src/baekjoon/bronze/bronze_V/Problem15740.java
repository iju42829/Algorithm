package baekjoon.bronze.bronze_V;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem15740 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] numbers = sc.nextLine().split(" ");

        BigInteger a = new BigInteger(numbers[0]);
        BigInteger b = new BigInteger(numbers[1]);

        System.out.println(a.add(b));
    }
}
