package baekjoon.silver.silver_V;

import java.io.*;

public class Problem4659 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        while (true) {
            String input = br.readLine();

            if (input.equals("end")) {
                break;
            }

            if (checkVowels(input) && checkDouble(input) && checkThreeTimeVowels(input) && checkThreeTimeConsonants(input)) {
                sb.append("<").append(input).append("> ").append("is acceptable.\n");
            } else {
                sb.append("<").append(input).append("> ").append("is not acceptable.\n");
            }
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }

    private static boolean checkVowels(String input) {
        return input.contains("a")
                || input.contains("e")
                || input.contains("i")
                || input.contains("o")
                || input.contains("u");
    }

    private static boolean checkThreeTimeVowels(String input) {
        for (int i = 0; i <= input.length() - 3; i++) {
            int count = 0;

            for (int j = i; j < i + 3; j++) {
                if (checkVowels(String.valueOf(input.charAt(j)))) {
                    count++;
                }
            }

            if (count == 3) {
                return false;
            }
        }

        return true;
    }

    private static boolean checkThreeTimeConsonants(String input) {
        for (int i = 0; i <= input.length() - 3; i++) {
            int count = 0;

            for (int j = i; j < i + 3; j++) {
                if (!checkVowels(String.valueOf(input.charAt(j)))) {
                    count++;
                }
            }

            if (count == 3) {
                return false;
            }
        }

        return true;
    }

    private static boolean checkDouble(String input) {
        for (int i = 1; i < input.length(); i++) {
            if ((input.charAt(i-1) == 'e' && input.charAt(i) == 'e') || (input.charAt(i-1) == 'o' && input.charAt(i) == 'o')) {
                continue;
            }

            if (input.charAt(i-1) == input.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}

