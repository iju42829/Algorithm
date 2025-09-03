package baekjoon.silver.silver_II;

import java.util.*;

public class Problem5567 {

    static class Person {
        int number;
        int dist;

        public Person(int number, int dist) {
            this.number = number;
            this.dist = dist;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        int count = 0;
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i <= n; i++)
            list.add(new ArrayList<>());

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(), b = sc.nextInt();

            list.get(a).add(b);
            list.get(b).add(a);
        }

        boolean[] visited = new boolean[n+1];

        visited[1] = true;
        Queue<Person> queue = new ArrayDeque<>();

        queue.add(new Person(1, 0));

        while (!queue.isEmpty()) {
            Person current = queue.poll();

            if (current.dist == 2)
                continue;

            for (int number : list.get(current.number)) {
                if (!visited[number] && current.dist < 2) {
                    visited[number] = true;
                    queue.add(new Person(number, current.dist + 1));
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
