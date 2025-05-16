package baekjoon.silver.silver_IV;

import java.util.*;

public class Problem11656 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        List<String> list = new ArrayList<>();

        int size = s.length();

        for (int i = 0; i < size; i++) {
            list.add(s.substring(i));
        }

        Collections.sort(list);

        for (String result : list) {
            System.out.println(result);
        }
    }
}
