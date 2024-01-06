package baekjoon.gold.gold_IV;

import java.io.*;
import java.util.PriorityQueue;

public class Problem1715 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                Card.inputData(Integer.parseInt(br.readLine()));
            }

            bw.write(Card.sortedCard() + "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class Card {
    private static int result;
    private static final PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

    public static void inputData(Integer number) {
        priorityQueue.add(number);
    }

    public static Integer sortedCard() {
        while (priorityQueue.size() > 1) {
            int a = priorityQueue.poll();
            int b = priorityQueue.poll();

            result += a + b;
            priorityQueue.add(a + b);
        }

        return result;
    }
}