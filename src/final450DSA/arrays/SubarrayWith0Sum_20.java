package final450DSA.arrays;

import java.util.HashMap;
import java.util.Scanner;

/*
Subarray with 0 sum
Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.

Example 1:

Input:
5
4 2 -3 1 6

Output:
Yes

Explanation:
2, -3, 1 is the subarray
with sum 0.
 */
public class SubarrayWith0Sum_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(findsum(array,n));

    }
    static boolean findsum(int arr[],int n)
    {
        //kadane algo
        // ________
        // _____  |
        // _ _  | |
        // 1 -1 3 2 -2 -8 1 7 10 23
        //    |_| |  |
        //    |___|  |
        //    |______|   o(n^3) all sub array   ---> optimize--->Hashmap tc=O(n^2) sc= O(1)
        // sum=s=0          | k,v   |
        // s=1              | (1,0) |
        // s= 1-1=0         max=2 length
        // s=3              |  3,2  |
        // s=5              |  5,3  |
        // s=3    3 exist in the hashmap
        //      _3_    _0_
        //     |   |  |  |
        //     0 1 2  3  4
        //     |________| = 3
        // s= -5            | -5 , 5 |
        // s=-4             | -4 , 6 |
        // s= -4+7=3            max=5(length)

        // eg : 4 2 -3 1 6
        // 4 6 3 4 10
        // ^     ^
        // |     |   prefix sum
        // tc=o(n^2) sc=o(1)
        // tc=o(n)   sc=o(n)
        // solo element = [ 1 2 0 3]
        HashMap <Integer,Integer> map= new HashMap<>();
        int sum=0;
        map.put(0,1);
        for (int i=0;i<n;i++){
            sum+=arr[i];
            if (map.containsKey(sum)){
                return true;
            }
            else {
                map.put(sum,1);
            }

        }
        return false;
    }
}
