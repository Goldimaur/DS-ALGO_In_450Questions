package final450DSA.arrays;

import java.util.Scanner;

/*
Minimum swaps and K together

Given an array arr of n positive integers and a number k. One can apply a swap operation on the array any number of times, i.e choose any two index i and j (i < j) and swap arr[i] , arr[j] . Find the minimum number of swaps required to bring all the numbers less than or equal to k together, i.e. make them a contiguous subarray.

Example 1:

Input :
arr[ ] = {2, 1, 5, 6, 3}
K = 3
Output :
1
Explanation:
To bring elements 2, 1, 3 together,
swap index 2 with 4 (0-based indexing),
i.e. element arr[2] = 5 with arr[4] = 3
such that final array will be-
arr[] = {2, 1, 3, 6, 5}
 */
public class MinimumSwapsAndKtogetheR_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k= scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(minSwap(array,n,k));
    }
    public static int minSwap (int arr[], int n, int k) {
        //Complete the function
        int fav=0,nonFav=0;
        // 2 1 5 6 3 = fav=3 , nonfav= 1 , k=3 , res= 1
        for (int i=0;i<n;i++){
            if(arr[i]<=k) fav++;
        }
        // window size
        for (int i=0;i<n;i++){
            if(arr[i]>k) nonFav++;
        }
        int left=0,right=fav-1, res=Integer.MAX_VALUE;
        while (right<n){
            res=Math.min(res,nonFav);
            right++;
            if (right<n && arr[right]>k) nonFav++;
            if (left<n && arr[left]>k) nonFav--;
            left++;
        }
        return (res==Integer.MAX_VALUE)?0:res;


    }

}
