package baekjoon.silver.silver_IV;

import java.io.*;
import java.util.*;

public class Problem10825 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");

            String name = input[0];
            int korean = Integer.parseInt(input[1]);
            int english = Integer.parseInt(input[2]);
            int math = Integer.parseInt(input[3]);

            studentList.add(new Student(name, korean, english, math));
        }

        Collections.sort(studentList ,(a, b) ->  {
            if (a.korean != b.korean) {
                return b.korean - a.korean;
            } else if (a.english != b.english) {
                return a.english - b.english;
            } else if (a.math != b.math) {
                return b.math - a.math;
            } else {
                return a.name.compareTo(b.name);
            }
        });

        for (Student s : studentList)
            bw.write(s.name + "\n");

        bw.close();
        br.close();
    }

    static class Student {
        String name;
        int korean;
        int english;
        int math;

        public Student(String name, int korean, int english, int math) {
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }
    }
}
