package sort;

public class MergeSort {
    public static void main(String[] args) {
        solution();
    }

    private static void solution() {
        int[] numbers = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        mergeSort(numbers, 0, numbers.length - 1);

        printArray(numbers);
    }

    private static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
    }

    private static void mergeSort(int[] numbers, int left, int right) {
        if (left == right)
            return;

        int mid = (left + right) / 2;

        mergeSort(numbers, left, mid);
        mergeSort(numbers, mid + 1, right);
        merge(numbers, left, mid, right);
    }

    private static void merge(int[] numbers, int left, int mid, int right) {
        int leftIndex = left;
        int rightIndex = mid + 1;
        int idx = left;

        int[] sorted = new int[numbers.length];

        while (leftIndex <= mid && rightIndex <= right) {
            if (numbers[leftIndex] <= numbers[rightIndex]) {
                sorted[idx] = numbers[leftIndex];

                leftIndex++;
            }

            else {
                sorted[idx] = numbers[rightIndex];

                rightIndex++;
            }
            idx++;
        }

        if (leftIndex > mid) {
            while (rightIndex <= right) {
                sorted[idx] = numbers[rightIndex];

                rightIndex++;
                idx++;
            }
        }

        else {
            while (leftIndex <= mid) {
                sorted[idx] = numbers[leftIndex];

                leftIndex++;
                idx++;
            }
        }

        for (int i = left; i <= right; i++) {
            numbers[i] = sorted[i];
        }
    }
}