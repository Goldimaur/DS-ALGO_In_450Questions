package final450DSA.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/*
Array Subset of another array

Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m.
 Task is to check whether a2[] is a subset of a1[] or not.
 Both the arrays can be sorted or unsorted.
 It may be assumed that elements in both array are distinct.


Example 1:

Input:
a1[] = {11, 1, 13, 21, 3, 7}
a2[] = {11, 3, 7, 1}
Output:
Yes
Explanation:
a2[] is a subset of a1[]
 */
public class ArraySubsetOfAnotherArray_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         ArraySubsetOfAnotherArray_26 a= new ArraySubsetOfAnotherArray_26();
        long n = scanner.nextLong();
        long[] array = new long[(int) n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLong();
        }

        long m = scanner.nextLong();
        long[] array1 = new long[(int) n];
        for (int i = 0; i < m; i++) {
            array1[i] = scanner.nextLong();
        }
        System.out.println(a.isSubset(array,array1,n,m));


    }
    public String isSubset( long a1[], long a2[], long n, long m) {

        //m1 : tc=o(n^2)  sc= o(1)
        // m2 (sorting + binary search)
        //tc= o(nlogn + mlogm)  sc= o(1)
        // (sorting two pointer)   a[i]==a[j]  , a[i]<a[j]
        // m3= o(nlogn +mlogm)   sc=(1)
        // m4 hashing
        // o(n)  sc= o(n)
        HashSet<Long> set=new HashSet<>();
        for (int i=0;i<n;i++){
            set.add(a1[i]);
        }
        for (int j=0;j<m;j++){
            if (!set.contains(a2[j])) return "No";
        }
        return  "Yes";
    }
}
