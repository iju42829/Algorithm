package baekjoon.bronze.bronze_II;

import java.util.Scanner;

public class Problem5586 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int jCount = 0, iCount = 0;

        for (int i = 0; i <= s.length() - 3; i++) {
            String temp = s.substring(i, i + 3);

            if (temp.equals("JOI"))
                jCount++;
            else if (temp.equals("IOI"))
                iCount++;
        }

        System.out.println(jCount);
        System.out.println(iCount);
    }
}
