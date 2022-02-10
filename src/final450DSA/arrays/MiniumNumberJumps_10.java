package final450DSA.arrays;

import java.util.Scanner;
/*
Given an array of N integers arr[] where each element represents the max number of steps that can be made forward from that element. Find the minimum number of jumps to reach the end of the array (starting from the first element). If an element is 0, then you cannot move through that element.
Note: Return -1 if you can't reach the end of the array.

// 10 question


Example 1:

Input:
N = 11
arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
Output: 3
Explanation:
First jump from 1st element to 2nd
element with value 3. Now, from here
we jump to 5th element with value 9,
and from here we will jump to last.
 */
public class MiniumNumberJumps_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();

        }
        System.out.println(minJumps(array));
    }
    static int minJumps(int[] arr){
        // your code here
        int n=arr.length;
        int maxReach=arr[0];
        int step=arr[0];
        int jump =1;
        if(n==1) return 0;
        else if(arr[0]==0) return -1;
        else {
            for (int i = 1; i < n; i++) {
                if (i == n - 1)
                    return jump;

                maxReach = Math.max(maxReach, i + arr[i]);
                step--;

            if (step == 0) {
                jump++;
                if (i >= maxReach) return -1;
                step = maxReach - i;
            }
        }
        }
        return  -1;
    }
}
