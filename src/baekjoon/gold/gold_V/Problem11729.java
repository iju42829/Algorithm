package baekjoon.gold.gold_V;

import java.io.*;

/**
 * 재귀 문제 - 하노이 탑 이동 순서 (11729)
 * 분류 : 골드 V
 */

public class Problem11729 {
    private static final StringBuilder sb = new StringBuilder();
    private static int moveCount = 0;

    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int n = Integer.parseInt(br.readLine());

            hanoi(n, "1", "2", "3");

            bw.write(moveCount + "\n");
            bw.write(sb.toString());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * 원판의 이동 횟수를 카운트하고 원판의 이동 경로를 출력합니다.
     * @param n 이동할 원판의 개수
     * @param from 출발 기둥
     * @param by 보조 기둥
     * @param to 도착 기둥
     */
    private static void hanoi(int n, String from, String by, String to)  {
        // 원판이 1개인 경우 이동 후 해당 함수 종료
        if (n == 1) {
            sb.append(from).append(" ").append(to).append("\n");
            moveCount++;
            return;
        }

        // n - 1의 원판을 "1" -> "2"로 이동.
        hanoi(n - 1, from, to, by);

        // 이동후 맨 아래 있는 제일 큰 원판을 "1" -> "3"으로 이동
        sb.append(from).append(" ").append(to).append("\n");
        moveCount++;

        // n - 1의 원판을 "2" -> "3" 으로 이동
        hanoi(n - 1, by, from, to);
    }
}