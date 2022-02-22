package final450DSA.arrays;

import java.util.HashSet;
import java.util.Scanner;

/*
Given an array arr of size n and an integer X.
Find if there's a triplet in the array which sums up to the given integer X.

Example 1:

Input:
n = 6, X = 13
arr[] = [1 4 45 6 10 8]
Output:
1
Explanation:
The triplet {1, 4, 8} in
the array sums up to 13.
 */
public class TripletSumArray_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int targetSum=scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();

        }
        System.out.println(find3Numbers(array,n,targetSum));
    }
    public static boolean find3Numbers(int A[], int n, int X) {
        // 3 pointer o(n^3)  sc=o(1)
        //m2 : sorting
        // pair sum a[i]+a[j]= 25-a[k]  :  3+12=15  :15 < 24 : 4+12=16  16< 24 : 6+12 = 18 ....
        for (int i=0;i<n-2;i++){
            HashSet<Integer> set=new HashSet<>();
            int toFind=X-A[i];
            for (int j=i+1;j<n;j++){
                if (set.contains(toFind-A[j])){
                    return true;
                }
                set.add(A[j]);
            }
        }
        return false;


    }
}
