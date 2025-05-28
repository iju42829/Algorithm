package baekjoon.bronze.bronze_III;

import java.io.*;

public class Problem2588 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String a = br.readLine();
        String b = br.readLine();

        String[] temp = b.split("");

        for (int i = temp.length - 1; i >= 0; i--) {
            System.out.println(Integer.parseInt(a) * Integer.parseInt(temp[i]));

        }

        System.out.println(Integer.parseInt(a) * Integer.parseInt(b));
    }
}
