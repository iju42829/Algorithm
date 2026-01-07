package baekjoon.bronze.bronze_III;

import java.util.*;

public class Problem2857 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            String name = sc.nextLine();
            if (name.contains("FBI")) {
                result.add(i);
            }
        }

        if (result.isEmpty()) {
            System.out.println("HE GOT AWAY!");
        } else {
            for (int i = 0; i < result.size(); i++) {
                if (i > 0) System.out.print(" ");
                System.out.print(result.get(i));
            }
        }
  }
}
