package final450DSA.arrays;

import java.util.Scanner;

/*
Kadane's Algorithm

// 8 question

Given an array Arr[] of N integers.
Find the contiguous sub-array(containing at least one number)
 which has the maximum sum and return its sum.

Example 1:

Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which
is a contiguous subarray.
 */
public class LargestSubArraySum_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LargestSubArraySum_8 largestSubArraySum_8=new LargestSubArraySum_8();
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();

        }
        System.out.println(largestSubArraySum_8.maxSubarraySum(array,n));
    }
    long maxSubarraySum(int arr[], int n){
        int max_far=Integer.MIN_VALUE,maxEnd=0;
        // Integer.MIN_VALUE = -2147483648
        for (int i=0;i<n;i++){
            maxEnd=maxEnd+arr[i];
            if(max_far<maxEnd)
                max_far=maxEnd;
            if(maxEnd<0)
                maxEnd=0;
        }
        return max_far;

    }

}
