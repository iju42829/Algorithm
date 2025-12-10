package baekjoon.bronze.bronze_V;

import java.util.Scanner;

public class Problem34691 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.nextLine();

            if (input.equals("end"))
                break;

            if (input.equals("animal")) {
                System.out.println("Panthera tigris");
            }

            if (input.equals("tree")) {
                System.out.println("Pinus densiflora");
            }

            if (input.equals("flower")) {
                System.out.println("Forsythia koreana");
            }
        }
    }
}
