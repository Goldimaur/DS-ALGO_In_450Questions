package final450DSA.arrays;

import java.util.Scanner;

/*
Maximum Product Subarray
Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.

Example 1:

Input:
N = 5
Arr[] = {6, -3, -10, 0, 2}
Output: 180
Explanation: Subarray with maximum product
is [6, -3, -10] which gives product as 180.
 */
public class MaxProductSubarray_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();

        }
        MaxProductSubarray_22 o= new MaxProductSubarray_22();
        System.out.println(o.maxProduct(array,n));

    }
    long maxProduct(int[] arr, int n) {
        // comparing index in linear way o(n^2)
        // optimize o(n)
        // maxProd= max(a[i],maxarr[i])  maxProd=2
        // minProd=min(a[i],minarr[i])   minProd=2
        // if - values swap maxProd ans minProd
        // update ans = maxProd ( maxProd < new maxProd)
        long ans=Integer.MIN_VALUE;
        long maxProd=1;
        long minProd=1;
        for (int i=0;i<n;i++){
            if(arr[i] < 0){
                long temp=maxProd;
                maxProd=minProd;
                minProd=temp;
            }
            maxProd=Math.max(arr[i],maxProd*arr[i] );
            minProd=Math.min(arr[i],minProd*arr[i] );
            ans=Math.max(ans,maxProd);
        }
        return  ans;
    }
}
