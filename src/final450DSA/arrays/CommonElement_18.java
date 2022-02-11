package final450DSA.arrays;

import java.util.ArrayList;
import java.util.Scanner;

/*
Common elements
Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
Note: can you take care of the duplicates without using any additional Data Structure?
Example 1:
Input:
n1 = 6; A = {1, 5, 10, 20, 40, 80}
n2 = 5; B = {6, 7, 20, 80, 100}
n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20 80
Explanation: 20 and 80 are the only
common elements in A, B and C.
 */
public class CommonElement_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] array2 = new int[n];
        for (int i = 0; i < m; i++) {
            array2[i] = scanner.nextInt();
        }
        int f = scanner.nextInt();
        int[] array3 = new int[n];
        for (int i = 0; i < f; i++) {
            array3[i] = scanner.nextInt();
        }
        CommonElement_18 c= new CommonElement_18();
        System.out.println(c.commonElements(array,array2,array3,n,m,f));
    }
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        // brute force compare element of a then b and c
        // in better approch make frequency table of A B C
        // pointer in every array ( merge sort)
        ArrayList <Integer> res= new ArrayList<>();
        int i=0,j=0,k=0;
        while (i<n1 && j< n2 && k < n3){
            if (A[i]==B[j] && B[j]==C[k])
            {
                res.add(A[i] );
                int element=A[i];
                while (i<n1 && A[i] == element) i++;
                while (j<n2 && B[j] == element) j++;
                while (k<n3 && C[k] == element) k++;

            }
            else  if (A[i] < B[j]) i++;
            else if (B[j] < C[k]) j++;
            else k++;
        }
        return  res;
    }
}
