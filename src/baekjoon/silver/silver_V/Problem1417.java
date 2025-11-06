package baekjoon.silver.silver_V;

import java.util.*;

public class Problem1417 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int numberOne = sc.nextInt();
        int count = 0;

        var pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (int i = 0; i < n - 1; i++) {
            pq.add(sc.nextInt());
        }

        while (!pq.isEmpty() && pq.peek() >= numberOne) {
            int top = pq.poll();
            count++;
            numberOne++;
            top--;
            pq.add(top);
        }

        System.out.println(count);
    }
}
