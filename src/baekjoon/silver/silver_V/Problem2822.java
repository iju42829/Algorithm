package baekjoon.silver.silver_V;

import java.util.*;

public class Problem2822 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 1; i <= 8; i++) {
            map.put(sc.nextInt(), i);
        }

        int total = 0;
        int count = 0;
        List<Integer> problemList = new ArrayList<>();


        for (Map.Entry<Integer, Integer> entry : map.descendingMap().entrySet()) {
            if (count == 5) break;
            total += entry.getKey();
            problemList.add(entry.getValue());
            count++;
        }

        Collections.sort(problemList);

        System.out.println(total);

        for (int problem : problemList)
            System.out.print(problem + " ");

        System.out.println();
    }
}
