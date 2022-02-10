package final450DSA.arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Count Inversions

Given an array of integers. Find the Inversion Count in the array.

Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If array is already sorted then the inversion count is 0. If an array is sorted in the reverse order then the inversion count is the maximum.
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.


Example 1:

Input: N = 5, arr[] = {2, 4, 1, 3, 5}
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5
has three inversions (2, 1), (4, 1), (4, 3).
 */
public class CountInversion_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long[] array = new long[(int) n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLong();
        }
        System.out.println(inversionCount(array,n));
    }
    // o(n^2)
    // inversion condition ---> a[i] > a[j] and i< j
    // 9       6 8 4
    //   \ \ \ | /
    //  9 6 8  4  =5
    // optimize it merge sort
    // 1 20 6 7 ---- 5 8 11 3 parition -->
    // 1 20 - 6 7 --5 8 --11 3
    // 1-20   6-7 ---5 -8  11-3
    // 1 20   6 7    5 8   2 11 count =1
    // ^      ^ ^    5>3 +1 , 5>11 != , 8>2 +1 , 8>11!= count = 1+2=3
    // |      |+ |+           count 3+2 =5
    //  1 6 7 20      3 5 8 11
    //         \     /
    //  1 < 3  no change in count
    //  pointer = 6 (count =5+3=8)
    //  pointer =20 count 8+2+2=13
    //  o( nlogn)
static long inversionCount(long arr[], long N) {
    return mergeSort(arr, 0, (int) N - 1);
}

    private static long mergeSort(long[] arr, int low, int high) {
        if (low >= high) {
            return 0;
        }
        int mid = low + (high - low) / 2;

        long left = mergeSort(arr, low, mid);
        long right = mergeSort(arr, mid + 1, high);

        long leftRight = merge(arr, low, mid, mid + 1, high);
        return left + right + leftRight;
    }

    private static long merge(long[] arr, int a1l, int a1r, int a2l, int a2r) {
        long inv = 0;
        long[] res = new long[a1r - a1l + a2r - a2l + 2];
        int i = a1l, j = a2l, k = 0;
        while (i <= a1r && j <= a2r) {
            if (arr[i] > arr[j]) {
                res[k] = arr[j];
                k++;
                j++;
                inv += a1r - i + 1;
            } else {
                res[k] = arr[i];
                i++;
                k++;
            }
        }

        while (i <= a1r) {
            res[k] = arr[i];
            i++;
            k++;
        }

        while (j <= a2r) {
            res[k] = arr[j];
            k++;
            j++;
        }
        if (a2r + 1 - a1l >= 0) System.arraycopy(res, 0, arr, a1l, a2r + 1 - a1l);
        return inv;
    }

}
