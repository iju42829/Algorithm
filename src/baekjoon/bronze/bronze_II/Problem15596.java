package baekjoon.bronze.bronze_II;

public class Problem15596 {
    long sum(int[] a) {
        long sum = 0;

        for (int i : a)
            sum+= i;

        return sum;
    }
}
