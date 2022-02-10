package final450DSA.arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4
 */
// 7 question
public class CyclicallyRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();

        }


        rotate(array,n);
    }
//    public static void rotate(int arr[], int n)
//    {
//        System.out.print(arr[n-1]);
//        for (int i = 1; i < n-1; i++) {
//            System.out.print(arr[i]);
//
//        }
//        System.out.print(arr[0]);
//    }
    public static void rotate(int arr[], int n)
    {
        int temp = arr[n - 1];

        System.arraycopy(arr, 0, arr, 1, n - 1);
        arr[0] = temp;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

}
