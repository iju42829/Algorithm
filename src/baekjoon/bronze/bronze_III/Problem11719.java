package baekjoon.bronze.bronze_III;

import java.io.*;

public class Problem11719 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String text = null;

        while ((text = br.readLine()) != null) {
            bw.write(text + "\n");
        }

        br.close();
        bw.close();
    }
}
