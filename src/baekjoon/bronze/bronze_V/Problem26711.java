package baekjoon.bronze.bronze_V;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem26711 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger a = new BigInteger(sc.nextLine());
        BigInteger b = new BigInteger(sc.nextLine());

        System.out.println(a.add(b));
    }
}
