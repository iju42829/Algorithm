package baekjoon.gold.gold_IV;

import java.io.*;
import java.util.*;

public class Problem1043 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int n, m;
    private static int[] unf;

    public static void main(String[] args) throws IOException {
        init();
        int result = solve();
        bw.write(result + "\n");

        bw.close();
        br.close();
    }

    private static int solve() throws IOException {
        int count = 0;

        st = new StringTokenizer(br.readLine());

        int truthPersonCount = Integer.parseInt(st.nextToken());
        List<Integer> truthPersons = new ArrayList<>();

        parentInit(truthPersons);

        int parent = -1;

        if (truthPersonCount > 0) {
            parent = truthPersons.get(0);
        }

        List<List<Integer>> memory = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            memory.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            if (truthPersonCount == 0)
                continue;

            int partyPersonCount = Integer.parseInt(st.nextToken());

            List<Integer> partyPersons = new ArrayList<>();
            while (st.hasMoreTokens()) {
                int person = Integer.parseInt(st.nextToken());
                partyPersons.add(person);
                memory.get(i).add(person);
            }

            boolean flag = false;
            for (int person : partyPersons) {
                int check = find(person);

                if (find(parent) == check) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                for (int a : partyPersons) {
                    union(parent, a);
                }

                boolean changed = true;
                while (changed) {
                    changed = false;
                    for (List<Integer> party : memory) {
                        boolean hasTruth = false;
                        for (int person : party) {
                            if (find(parent) == find(person)) {
                                hasTruth = true;
                                break;
                            }
                        }
                        if (hasTruth) {
                            for (int person : party) {
                                if (find(parent) != find(person)) {
                                    union(parent, person);
                                    changed = true;
                                }
                            }
                        }
                    }
                }
            }
        }

        if (truthPersonCount == 0)
            return m;

        for (List<Integer> mem : memory) {
            boolean flag = false;

            for (int m : mem) {
                int check = find(m);

                if (find(parent) == check) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                count++;
            }
        }

        return count;
    }

    private static void parentInit(List<Integer> truthPersons) {
        while (st.hasMoreTokens()) {
            truthPersons.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < truthPersons.size() - 1; i++) {
            int a = truthPersons.get(i);
            int b = truthPersons.get(i + 1);

            union(a, b);
        }
    }

    private static int find(int v) {
        if (unf[v] == v) return v;
        return unf[v] = find(unf[v]);
    }

    private static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);

        if (fa != fb)
            unf[fb] = fa;
    }

    private static void init() throws IOException {
        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        unf = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            unf[i] = i;
        }
    }
}
