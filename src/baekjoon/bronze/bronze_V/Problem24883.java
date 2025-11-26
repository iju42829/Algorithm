package baekjoon.bronze.bronze_V;

import java.util.Scanner;

public class Problem24883 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        if (input.equals("N") || input.equals("n"))
            System.out.println("Naver D2");
        else
            System.out.println("Naver Whale");
    }
}
