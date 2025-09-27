package baekjoon.silver.silver_IV;

import java.util.*;

public class Problem1822 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();

        Set<Integer> aSet = new HashSet<>();
        for (int i = 0; i < a; i++)
            aSet.add(sc.nextInt());

        for (int i = 0; i < b; i++)
            aSet.remove(sc.nextInt());

        System.out.println(aSet.size());
        List<Integer> list = new ArrayList<>(aSet);

        Collections.sort(list);

        for (Integer i : list)
            System.out.print(i + " ");
        System.out.println();
    }
}
