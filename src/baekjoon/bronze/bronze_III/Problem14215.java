package baekjoon.bronze.bronze_III;

import java.util.Arrays;
import java.util.Scanner;

public class Problem14215 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];

        numbers[0] = sc.nextInt();
        numbers[1] = sc.nextInt();
        numbers[2] = sc.nextInt();

        Arrays.sort(numbers);

        if (numbers[0] + numbers[1] <= numbers[2])
            numbers[2] = numbers[0] + numbers[1] - 1;

        System.out.println(numbers[0] + numbers[1] + numbers[2]);
    }
}
