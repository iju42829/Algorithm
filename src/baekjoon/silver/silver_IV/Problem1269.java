package baekjoon.silver.silver_IV;

import java.util.*;

public class Problem1269 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();

        Set<Integer> aSet = new HashSet<>(), bSet = new HashSet<>();

        for (int i = 0; i < a; i++) {
            aSet.add(sc.nextInt());
        }

        for (int i = 0; i < b; i++) {
            bSet.add(sc.nextInt());
        }

        for (Integer temp : aSet) {
            if (bSet.contains(temp))
                a--;
        }

        for (Integer temp : bSet) {
            if (aSet.contains(temp))
                b--;
        }

        System.out.println(a + b);
    }
}
