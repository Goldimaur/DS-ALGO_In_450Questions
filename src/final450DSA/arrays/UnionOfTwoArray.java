package final450DSA.arrays;

import java.util.HashSet;
import java.util.Scanner;
/*
Input:
6 2
85 25 1 32 54 6
85 2
Output:
7
Explanation:
85, 25, 1, 32, 54, 6, and
2 are the elements which comes in the
union set of both arrays. So count is 7.
 */
// 6 question
public class UnionOfTwoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int m = scanner.nextInt();
        int[] array2 = new int[m];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();

        }
        for (int i = 0; i < m; i++) {
            array2[i] = scanner.nextInt();

        }
        System.out.println("Intersection");
        System.out.println(doIntersection(array,n,array2,m));
        System.out.println("union");
        System.out.println(doUnion(array,n,array2,m));
    }
     static int doIntersection(int a[], int n, int b[], int m)
    {
        int count=0,i=0,j=0;
       while (i< a.length && j< b.length) {
           if (a[i] == b[j]) {
               i++;
               j++;
               count++;
           } else if (a[i] > b[j]) {
               j++;

           } else
               i++;
       }


        return count;
    }
    static int doUnion(int[] a, int n, int[] b, int m) {
        //Your code here
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            hashSet.add(a[i]);
        }

        for (int i = 0; i < m; i++) {
            hashSet.add(b[i]);
        }
        return hashSet.size();
    }
//    public static int doUnion(int a[], int n, int b[], int m)
//    {
//        System.out.print(a[n-1]);
//        for (int i = 1; i < n-1; i++) {
//            System.out.print(a[i]);
//
//        }
//        System.out.print(a[0]);
//        //Your code here
//    }
}
