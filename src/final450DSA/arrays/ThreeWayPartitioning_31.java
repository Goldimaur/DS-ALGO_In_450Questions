package final450DSA.arrays;

import java.util.Scanner;

/*
Three way partitioning
Given an array of size n and a range [a, b]. The task is to partition the array around the range such that array is divided into three parts.
1) All elements smaller than a come first.
2) All elements in range a to b come next.
3) All elements greater than b appear in the end.
The individual elements of three sets can appear in any order. You are required to return the modified array.
 */
public class ThreeWayPartitioning_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++)
        {
            array[i] = scanner.nextInt();
        }
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println();
        ThreeWayPartitioning_31 h= new ThreeWayPartitioning_31();
        h.threeWayPartition(array,a,b);
    }
    public void threeWayPartition(int array[], int a, int b)
    {
        // o(n)  sc=o(1)
        int left=0;
        int right=array.length-1;
        int i=0;
        for (i=0;i<=right;i++){
            if (array[i]<a){
                swap(array,left,i);
                left++;

            }else if (array[i]>b){
                swap(array,right,i);
                right--;
                i--;
            }
        }
    }
    public static  void swap(int array[] , int l , int r){
        int temp=array[l];
        array[l]=array[r];
        array[r]=temp;
    }
}
