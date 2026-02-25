package baekjoon.bronze.bronze_V;

import java.util.Scanner;

public class Problem28074 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    boolean hasM = false, hasO = false, hasB = false, hasI = false, hasS = false;
  
    for (int idx = 0; idx < s.length(); idx++) {
      char c = s.charAt(idx);
      if (c == 'M') hasM = true;
      else if (c == 'O') hasO = true;
      else if (c == 'B') hasB = true;
      else if (c == 'I') hasI = true;
      else if (c == 'S') hasS = true;
    }

    if (hasM && hasO && hasB && hasI && hasS) System.out.println("YES");
    else System.out.println("NO");
  }
}
