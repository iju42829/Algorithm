package baekjoon.bronze.bronze_III;

import java.util.*;

public class Problem5597 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();

        for (int i = 1; i <= 30; i++) {
            set.add(i);
        }

        for (int i = 0; i < 28; i++) {
            set.remove(sc.nextInt());
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
