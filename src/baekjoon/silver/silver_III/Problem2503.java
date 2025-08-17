package baekjoon.silver.silver_III;

import java.io.*;

public class Problem2503 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static Person[] personArr;
    private static int count = 0;

    public static void main(String[] args) throws IOException {
        init();
        progress();

        bw.write(count + "\n");

        br.close();
        bw.close();
    }

    private static void init() throws IOException {
        int n = Integer.parseInt(br.readLine());
        personArr = new Person[n];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            personArr[i] = new Person(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]));
        }
    }

    private static void progress() {
        for (int i = 111; i <= 999; i++) {
            String loopNumber = String.valueOf(i);

            if (!isValid(loopNumber))
                continue;

            boolean flag = true;

            for (Person person : personArr) {
                if (!person.allCheck(loopNumber)) {
                    flag = false;
                    break;
                }
            }

            if (flag)
                count++;
        }
    }

    private static boolean isValid(String number) {
        return number.charAt(0) != '0'
                && number.charAt(1) != '0'
                && number.charAt(2) != '0'
                && number.charAt(0) != number.charAt(1)
                && number.charAt(0) != number.charAt(2)
                && number.charAt(1) != number.charAt(2);
    }

    static class Person {
        String number;
        Integer strike;
        Integer ball;

        public Person(String number, Integer strike, Integer ball) {
            this.number = number;
            this.strike = strike;
            this.ball = ball;
        }

        public boolean allCheck(String number) {
            return ballCheck(number) && strikeCheck(number);
        }

        public boolean ballCheck(String number) {
            int ballCount = 0;

            for (int i = 0; i < number.length(); i++) {
                if ((this.number.charAt(i) != number.charAt(i)) && this.number.contains(String.valueOf(number.charAt(i)))) {
                    ballCount++;
                }
            }

            return this.ball == ballCount;
        }

        public boolean strikeCheck(String number) {
            int strikeCount = 0;

            for (int i = 0; i < number.length(); i++) {
                if (this.number.charAt(i) == number.charAt(i)) {
                    strikeCount++;
                }
            }

            return this.strike == strikeCount;
        }
    }
}
