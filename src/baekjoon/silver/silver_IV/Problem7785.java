package baekjoon.silver.silver_IV;

import java.util.*;

public class Problem7785 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            var st = new StringTokenizer(sc.nextLine());

            String name = st.nextToken(), order = st.nextToken();

            if (order.equals("leave")) {
                set.remove(name);
            } else {
                set.add(name);
            }
        }

        var strings = new ArrayList<>(set);
        Collections.sort(strings, Collections.reverseOrder());

        for (String s : strings) {
            System.out.println(s);
        }
    }
}
