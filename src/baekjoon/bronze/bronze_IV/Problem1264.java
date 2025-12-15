package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem1264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String line = sc.nextLine();

            if (line.equals("#")) {
                break;
            }

            int count = 0;

            for (int i = 0; i < line.length(); i++) {
                char c = Character.toLowerCase(line.charAt(i));

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
