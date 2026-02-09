package baekjoon.bronze.bronze_IV;

import java.util.Scanner;

public class Problem2083 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      String name = sc.next();
      int age = sc.nextInt(), weight = sc.nextInt();
      
      if (name.equals("#") && age == 0 && weight == 0)
        break;

      if (age > 17 || weight >= 80) {
        System.out.println(name + " Senior");
      } else {
        System.out.println(name + " Junior");
      }
    }
  }
}
