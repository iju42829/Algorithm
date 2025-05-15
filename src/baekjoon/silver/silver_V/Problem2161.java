package baekjoon.silver.silver_V;

import java.util.*;

public class Problem2161 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 1; i <= n; i++)
            queue.add(i);

        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
            if (queue.isEmpty())
                break;
            queue.add(queue.poll());
        }
    }
}
