package baekjoon.bronze.bronze_I;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Problem1924 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();

        LocalDate date = LocalDate.of(2007, month, day);

        DayOfWeek dayOfWeek = date.getDayOfWeek();

        System.out.println(dayOfWeek.toString().substring(0, 3));
    }
}
