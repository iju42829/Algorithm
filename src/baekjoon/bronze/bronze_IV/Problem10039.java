package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem10039 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int students = 5;

        for (int i = 0; i < students; i++) {
            int score = scanner.nextInt();
            if (score < 40) {
                score = 40;
            }
            sum += score;
        }

        int average = sum / students;
        System.out.println(average);
    }
}
