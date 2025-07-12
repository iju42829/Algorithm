package baekjoon.silver.silver_V;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem5635 {

    static class Student {
        String name;
        int day;
        int month;
        int year;

        public Student(String name, int day, int month, int year) {
            this.name = name;
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();
            studentList.add(new Student(name, day, month, year));
        }

        List<Student> sorted = studentList.stream()
                .sorted((s1, s2) -> {
                    if (s1.year != s2.year) return s2.year - s1.year;
                    if (s1.month != s2.month) return s2.month - s1.month;
                    return s2.day - s1.day;
                }).collect(Collectors.toList());

        System.out.println(sorted.get(0).name);
        System.out.println(sorted.get(sorted.size() - 1).name);
    }
}
