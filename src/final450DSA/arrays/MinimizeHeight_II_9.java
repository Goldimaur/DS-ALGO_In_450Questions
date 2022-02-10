package final450DSA.arrays;

import com.sun.source.tree.BreakTree;

import java.util.Arrays;
import java.util.Scanner;

/*
Given an array arr[] denoting heights of N towers and a positive integer K, you have to modify the height of each tower either by increasing or decreasing them by K only once. After modifying, height should be a non-negative integer.
Find out the minimum possible difference of the height of shortest and longest towers after you have modified each tower.

You can find a slight modification of the problem here.
Note: It is compulsory to increase or decrease (if possible) by K to each tower.


Example 1:

Input:
K = 2, N = 4
Arr[] = {1, 5, 8, 10}
Output:
5
Explanation:
The array can be modified as
{3, 3, 6, 8}. The difference between
the largest and the smallest is 8-3 = 5.
 */
public class MinimizeHeight_II_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();

        }
        MinimizeHeight_II_9 minimizeHeight_ii_9=new MinimizeHeight_II_9();
        System.out.println(minimizeHeight_ii_9.getMinDiff(array,n,k));
    }

    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int ans = (arr[n - 1] + k) - (arr[0] + k);

        int maxVal= arr[n - 1] - k;

        int minVal = arr[0] + k;

        int max, min;

        for (int i = 0; i < n - 1; i++) {
            max = Math.max(maxVal, arr[i] + k);
            min = Math.min(minVal, arr[i + 1] - k);
            if(min<0) continue;

            ans = Math.min(ans, max - min);
        }
        return ans;

    }


}
