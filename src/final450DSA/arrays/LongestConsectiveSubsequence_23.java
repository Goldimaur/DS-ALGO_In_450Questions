package final450DSA.arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
Longest consecutive subsequence

Given an array of positive integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.


Example 1:

Input:
N = 7
a[] = {2,6,1,9,4,5,3}
Output:
6
Explanation:
The consecutive numbers here
are 1, 2, 3, 4, 5, 6. These 6
numbers form the longest consecutive
subsquence.
 */
public class LongestConsectiveSubsequence_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(findLongestConseqSubseq(array,n));
    }
    static int findLongestConseqSubseq(int arr[], int N)
    {
        // sort and check
        // 4 1 7 2 3 8 => 1 2 3 4 7 8   they are in diff of 1 1 2 3 4
        //o(nlogn)  sc=o(1)
        //optimize ( Hash) 4 1 7 2 3 8
        // 4 chech 4-1=3 is present than 1 ,1 0 is not present negelet
        // 7 6 is not present for 2 1 is there for 3 4 is there 1 2 3 4
        // for 8 7 is there => 7 8
        // ans= 4
        // o(n) sc=o(n)
        Set<Integer> set= new HashSet<>();
        for (int i:arr)
            set.add(i);
        int ans=0;
        for (int i=0;i<N;i++){
            if(!set.contains(arr[i]-1)){
                int j=arr[i]+1;
                while (set.contains(j))
                    j++;
                ans=Math.max(ans,j-arr[i]);
            }
        }
        return ans;

    }
}
