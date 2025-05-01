package baekjoon.gold.gold_IV;

import java.io.*;
import java.util.*;

public class Problem2504 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        solve();
    }

    private static void solve() throws IOException{
        char[] words = br.readLine().toCharArray();

        Stack<Character> stack = new Stack<>();
        int result = 0;
        int multiplier = 1;

        for (int i = 0; i < words.length; i++) {
            if (words[i] == '(') {
                stack.push(words[i]);
                multiplier *= 2;
            }

            else if (words[i] == '[') {
                stack.push(words[i]);
                multiplier *= 3;
            }

            else {
                if (stack.isEmpty()) {
                    result = 0;
                    break;
                }

                if (stack.peek() == '(' && words[i] == ')') {
                    if (words[i-1] == '(') {
                        result += multiplier;
                    }
                    stack.pop();
                    multiplier /= 2;
                }

                else if (stack.peek() == '[' && words[i] == ']') {
                    if (words[i-1] == '[') {
                        result += multiplier;
                    }
                    stack.pop();
                    multiplier /= 3;
                }

                else {
                    result = 0;
                    break;
                }
            }
        }

        if (!stack.isEmpty()) {
            result = 0;
        }

        bw.write(result + "\n");
        bw.close();
        br.close();
    }
}
