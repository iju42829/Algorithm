package baekjoon.gold.gold_V;

import java.io.*;

public class Problem7682 {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            while (true) {
                String game = br.readLine();

                if (game.equals("end")) {
                    break;
                }

                Board board = new Board();
                board.mapping(game);

                if (board.isValid()) {
                    bw.write("valid\n");

                } else {
                    bw.write("invalid\n");
                }

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class Board {
    private final char[][] map = new char[3][3];
    private int countX;
    private int countY;

    public void mapping(String game) {
        int index = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                map[i][j] = game.charAt(index);

                if (map[i][j] == 'X') {
                    countX++;
                }

                if (map[i][j] == 'O') {
                    countY++;
                }

                index++;
            }
        }
    }

    public boolean isValid() {
        boolean xFlag = winX();
        boolean yFlag = winY();

        if (xFlag && yFlag) {
            return false;
        }

        if (!( xFlag || yFlag )) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (map[i][j] == '.') {
                        return false;
                    }
                }
            }

            return countX == countY + 1;
        }

        if (xFlag) {
            if (countX == countY + 1) {
                return !yFlag;
            }
        }

        if (yFlag) {
            if (countX == countY) {
                return !xFlag;
            }
        }

        return false;
    }

    public boolean winX() {
        if (map[1][1] == map[0][1] && map[1][1] == map[2][1]) {
            if (map[1][1] == 'X') {
                return true;
            }
        }

        if (map[1][1] == map[0][0] && map[1][1] == map[2][2]) {
            if (map[1][1] == 'X') {
                return true;
            }
        }

        if (map[1][1] == map[2][0] && map[1][1] == map[0][2]) {
            if (map[1][1] == 'X') {
                return true;
            }
        }

        for (int i = 0; i < 3; i++) {
            int cnt = 0;

            for (int j = 0; j < 3; j++) {
                if (map[i][j] == 'X') {
                    cnt++;
                }
            }

            if (cnt == 3) {
                return true;
            }

            cnt = 0;
        }

        for (int i = 0; i < 3; i++) {
            int cnt = 0;

            for (int j = 0; j < 3; j++) {
                if (map[j][i] == 'X') {
                    cnt++;
                }
            }

            if (cnt == 3) {
                return true;
            }

            cnt = 0;
        }

        return false;
    }

    public boolean winY() {
        if (map[1][1] == map[0][1] && map[1][1] == map[2][1]) {
            if (map[1][1] == 'O') {
                return true;
            }
        }

        if (map[1][1] == map[0][0] && map[1][1] == map[2][2]) {
            if (map[1][1] == 'O') {
                return true;
            }
        }

        if (map[1][1] == map[2][0] && map[1][1] == map[0][2]) {
            if (map[1][1] == 'O') {
                return true;
            }
        }

        for (int i = 0; i < 3; i++) {
            int cnt = 0;

            for (int j = 0; j < 3; j++) {
                if (map[i][j] == 'O') {
                    cnt++;
                }
            }

            if (cnt == 3) {
                return true;
            }

            cnt = 0;
        }

        for (int i = 0; i < 3; i++) {
            int cnt = 0;

            for (int j = 0; j < 3; j++) {
                if (map[j][i] == 'O') {
                    cnt++;
                }
            }

            if (cnt == 3) {
                return true;
            }

            cnt = 0;
        }

        return false;
    }
}