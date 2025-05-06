package baekjoon.gold.gold_I;

import java.io.*;
import java.util.*;

public class Problem1700 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int[] arr;
    private static int n, k;
    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    private static void solve() throws IOException {
        int resultCount = 0;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < k; i++) {
            int temp = arr[i];

            if (set.contains(temp)) continue;

            if (set.size() < n) {
                set.add(temp);
            } else {
                resultCount++;

                Set<Integer> checkSet = new HashSet<>();
                List<Position> list = new ArrayList<>();
                for (int j = i + 1; j < k; j++) {
                    if (checkSet.contains(arr[j])) continue;
                    checkSet.add(arr[j]);

                    if (set.contains(arr[j]))
                        list.add(new Position(arr[j], j));
                }

                Collections.sort(list, (o1, o2) -> o2.findIndex - o1.findIndex);

                boolean flag = false;
                int index = 0;

                for (Integer num : set) {
                    if (!checkSet.contains(num)) {
                        flag = true;
                        index = num;
                        break;
                    }
                }

                if (flag) {
                    set.remove(index);

                } else if (!list.isEmpty()) {
                    set.remove(list.get(0).index);
                }
                set.add(temp);

            }
        }

        bw.write(resultCount + "\n");
        bw.close();
        br.close();
    }

    static class Position {
        int index;
        int findIndex;

        public Position(int index, int findIndex) {
            this.index = index;
            this.findIndex = findIndex;
        }

    }

    private static void init() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new int[k];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }
}
