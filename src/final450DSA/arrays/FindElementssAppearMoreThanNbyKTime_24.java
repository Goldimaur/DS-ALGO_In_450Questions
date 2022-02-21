package final450DSA.arrays;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
Given an array of size n and a number k, find all elements that appear more than n/k times
Given an array of size n, find all elements in array that appear more than n/k times.
 For example, if the input arrays is {3, 1, 2, 2, 1, 2, 3, 3} and k is 4, then the output should be [2, 3].
 Note that size of array is 8 (or n = 8), so we need to find all e
 */
public class FindElementssAppearMoreThanNbyKTime_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();

        }
    }

    // brute force approach , linear approach one by one traversal
    // tc=o(n^2) sc=o(1)
    // method 2 : sort 1 2 2 3 4 4 4 4
    // check arr[i]==arr[i+1]  count++
    // tc=o(nlogn)  sc=o(1)
    // method 3:  --> HashMap -->  store occurance/ frequency of each element
    // tc = o(n)
    // optimize : --> custom class { element , count of ele} --> take k-1 container

    static void printElements(int[] arr, int n, int k) {
        int x = n / k;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i : arr) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry m : map.entrySet()) {
            if ((int) m.getValue() > x) {
                System.out.println(m.getKey());
            }
        }
    }
}
