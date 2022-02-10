package final450DSA.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated
into ascending order.
 */
//4 question
public class SortingAlgoContain012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();

        }
        sortingUsingAlgo(array, n);

    }

    static void sortingUsingAlgo(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = 0;
                if (a[j] < a[i]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);

        }
    }

}
