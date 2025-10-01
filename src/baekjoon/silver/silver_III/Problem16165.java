package baekjoon.silver.silver_III;

import java.io.*;
import java.util.*;

public class Problem16165 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        var st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

        Map<String, List<String>> teamToMembers = new HashMap<>();
        Map<String, String> memberToTeam = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String team = br.readLine();
            int teamSize = Integer.parseInt(br.readLine());
            List<String> members = new ArrayList<>();

            for (int j = 0; j < teamSize; j++) {
                String member = br.readLine();
                members.add(member);
                memberToTeam.put(member, team);
            }

            Collections.sort(members);
            teamToMembers.put(team, members);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            String name = br.readLine();
            int type = Integer.parseInt(br.readLine());

            if (type == 0) {
                for (String s : teamToMembers.get(name)) {
                    sb.append(s).append("\n");
                }
            } else {
                sb.append(memberToTeam.get(name)).append("\n");
            }
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
