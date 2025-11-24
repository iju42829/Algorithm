package baekjoon.bronze.bronze_V;

import java.time.LocalDate;
import java.util.Scanner;

public class Problem33612 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        LocalDate start = LocalDate.of(2024, 8, 1);

        LocalDate result = start.plusMonths((long)(n-1) * 7);
        System.out.println(result.getYear() + " " + result.getMonthValue());
    }
}
