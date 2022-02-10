package final450DSA.arrays;

import java.util.Scanner;

/*
A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are considered permutations of arr: [1,2,3], [1,3,2], [3,1,2], [2,3,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
 */
public class NextPemutation_14_Leetcode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        NextPemutation_14_Leetcode h=new NextPemutation_14_Leetcode();
        h.nextPermutation(array);

    }
    public void nextPermutation(int[] nums) {
        // o(n) break point  + o(n) reverse traversal +o(n) + o(n)

       if(nums == null || nums.length <=1) return;
       int i=nums.length-2;
       while (i>=0 && nums[i]>=nums[i+1]) i--; // break point
       if(i>=0){
           int j=nums.length-1;
           while (nums[j]<=nums[i]) j--;
           swap(nums,i,j);

       }
       reverse(nums,i+1,nums.length-1);
    }

    private void reverse(int[] nums, int i, int j) {
        while (i<j) swap(nums,i++,j--);
    }

    private void swap(int[] nums, int i, int j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

}
