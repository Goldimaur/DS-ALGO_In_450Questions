package final450DSA.arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Merge Without Extra Space
Given two sorted arrays arr1[] of size N and arr2[] of size M. Each array is sorted in non-decreasing order. Merge the two arrays into one sorted array in non-decreasing order without using any extra space.


Example 1:

Input:
N = 4, M = 5
arr1[] = {1, 3, 5, 7}
arr2[] = {0, 2, 6, 8, 9}
Output: 0 1 2 3 5 6 7 8 9
Explanation: Since you can't use any
extra space, modify the given arrays
to form
arr1[] = {0, 1, 2, 3}
arr2[] = {5, 6, 7, 8, 9}
 */
public class MergeWithoutExtraSpace_12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();

        }
        int m = scanner.nextInt();
        int[] array2 = new int[m];
        for (int i = 0; i < m; i++) {
            array2[i] = scanner.nextInt();

        }


    }
    public void merge(int arr1[], int arr2[], int n, int m) {
        // tc=(n+m )log(n+m) here nlogn
        // code here
        int i = 0;
        int j = 0, k = n - 1;

        while (i <= k && j < m) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else {
                int temp = arr2[j];
                arr2[j] = arr1[k];
                arr1[k] = temp;
                j++;
                k--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

    }
    //2nd Method 1 4 7 8 10 , 2 3 9
    //gap=4       ^       ^
    //            |       |
    //(element)/2=4
    // if 7/2 = 4 (ceil)
    // log2n * o(n) worst case
    // tc= n(log n)  auxilary = o(1)
    // 1 2 3 4 10 , 4 7 9
    // ^   ^
    // |   |
    // gap 4/2=2
    // 1 2 3 4 7 , 8 10 9
    // gap=2/2 =1 ( 2nd pointer)
    // 1 2 3 4 7 , 8 10 9
    // ^ ^
    // | |
    // 1 2 3 4 7 , 8 9 10
    // notes
}
