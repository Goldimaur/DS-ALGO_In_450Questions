package final450DSA.arrays;

import java.util.Scanner;

/*
209. Minimum Size Subarray Sum
Given an array of positive integers nums and a positive integer target, return the minimal length of a contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr] of which the sum is greater than or equal to target. If there is no such subarray, return 0 instead.



Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 */
public class SmallestSubarrayWithSuMGreaterThanX_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();

        }
        int target=scanner.nextInt();
        SmallestSubarrayWithSuMGreaterThanX_30 s= new SmallestSubarrayWithSuMGreaterThanX_30();

        System.out.println(s.minSubArrayLen(target,array));
    }
//    1 4 45 6 0 19
//    start= 0 , end =3 [index] sum= 1+4+45+6=56
//    ans=int.MAX_VALUE
//    upper + lower-1 = e+s-1
    // create window instead of loop
    // sliding window of variable length

    public int minSubArrayLen(int target , int[] nums){
        int start=0, end=1;
        int sum=nums[start];
        if(sum >= target) return 1;
        int n=nums.length;
        int res= Integer.MAX_VALUE;
        if (end<nums.length) sum+=nums[end];
        while (start<n && end<n){
            if (sum>target){
                res=Math.min(res,end-start+1);
                sum+=nums[start];
                start++;
            }else {
                end++;
                if (end<n) sum+=nums[end];
            }
        }
        return (res==Integer.MAX_VALUE)?0:res;
    }

}
