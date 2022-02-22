package final450DSA.arrays;

import java.util.Scanner;

public class TrappingRainWater_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();

        }
        System.out.println(trappingWater(array, n));

    }
    // 2 pointer  i<=j {  a[i] < = a[j]
    // lmax , Rmax


    static long trappingWater(int[] arr, int n) {
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }

        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.min(left[i], right[i]) - arr[i];
        }
        return ans;
//    static long trappingWater(int arr[], int n) {
//        // Your code here
//        int i=0,j=n-1,lmax=0,ramax=0,r=0;
//        while (i<=j){
//            if(arr[i]<=arr[j]){
//                if (arr[i]>=lmax){
//                     lmax=arr[i];
//                    r=r+(lmax-arr[i]);
//                }else
//                    lmax=arr[i];
//                i++;
//            }else {
//                if (arr[j]< ramax){
//                   r=r+(ramax-arr[j]);
//                }else {
//                    r=r+(ramax-arr[j]);
//                    j--;
//                }
//            }
//
//        }
//        return r;
//    }
    }
}
