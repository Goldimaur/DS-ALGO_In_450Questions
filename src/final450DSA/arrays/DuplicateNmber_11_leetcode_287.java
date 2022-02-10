package final450DSA.arrays;

import java.util.Arrays;
import java.util.Scanner;
/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.



Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
 */
public class DuplicateNmber_11_leetcode_287 {
    public static void main(String[] args) {
        DuplicateNmber_11_leetcode_287 d=new DuplicateNmber_11_leetcode_287();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();

        }
        System.out.println(d.findDuplicate(array));
        System.out.println(d.findDuplicateLinkedListApproach(array));
    }
    public int findDuplicate(int[] nums) {
        boolean[] booleanArray = new boolean[nums.length];
        // tc=o(N) sc= o(N)
        for (int num : nums) {
            if (booleanArray[num]) {
                return num;
            }
            booleanArray[num] = true;
        }
        return -1;
    }
    // linkedList cyclic Method
     // TORTOISE APPROACH

    public int findDuplicateLinkedListApproach(int[] nums) {
        int slow=nums[0];
        int fast=nums[0];
        do{
            slow=nums[slow];
            fast=nums[nums[nums[fast]]];
        // tc=o(N) sc=o(1)
        }while(slow!=fast); // checking
        fast=nums[0];
        // printing of duplicate number
        while (slow!=fast){
            slow =nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
}
