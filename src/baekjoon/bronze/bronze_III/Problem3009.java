package baekjoon.bronze.bronze_III;

import java.util.*;

public class Problem3009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> aSet = new HashSet<>();
        Set<Integer> bSet = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            int a = sc.nextInt(), b = sc.nextInt();

            if (aSet.contains(a)) aSet.remove(a);
            else aSet.add(a);

            if (bSet.contains(b)) bSet.remove(b);
            else bSet.add(b);
        }

        for (Integer a : aSet) {
            System.out.print(a + " ");
        }

        for (Integer b : bSet) {
            System.out.println(b);
        }
    }
}
