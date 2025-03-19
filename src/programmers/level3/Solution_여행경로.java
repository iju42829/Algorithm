package programmers.level3;

import java.util.*;

public class Solution_여행경로 {
    private final List<String> resultList = new ArrayList<>();

    public String[] solution(String[][] tickets) {
        solve(tickets);

        return resultList.get(0).split(" ");
    }

    private void solve(String[][] tickets) {
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i][0].equals("ICN")) {
                boolean[] visited = new boolean[tickets.length];
                visited[i] = true;
                dfs(tickets, tickets[i][1], visited, 1, "ICN");
            }
        }
        Collections.sort(resultList);
    }

    private void dfs(String[][] tickets, String end, boolean[] visited, int depth, String path) {
        if (depth == tickets.length) {
            path += " " + end;
            resultList.add(path);
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (!visited[i] && end.equals(tickets[i][0])) {
                visited[i] = true;
                dfs(tickets, tickets[i][1], visited, depth + 1, path + " " + end);
                visited[i] = false;
            }
        }
    }
}
