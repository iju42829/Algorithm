package baekjoon.bronze.bronze_IV;

import java.util.*;

public class Problem10817 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());

        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list.get(1));
    }
}
