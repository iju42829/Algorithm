package baekjoon.silver;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Problem2164 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int n = Integer.parseInt(br.readLine());

            Queue<Integer> queue = new LinkedList<>();

             bw.write(numberList(queue, n) + "\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static int numberList(Queue<Integer> queue, int n) {
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (queue.size() != 1) {
            queue.remove();
            Integer number = queue.poll();

            queue.add(number);
        }


        return queue.poll();
    }
}