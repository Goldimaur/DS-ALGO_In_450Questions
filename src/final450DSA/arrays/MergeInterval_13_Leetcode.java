package final450DSA.arrays;

import java.lang.reflect.Array;
import java.util.*;

/*
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.



Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 */
public class MergeInterval_13_Leetcode {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n =scanner.nextInt();
        int m =scanner.nextInt();
        int[][] arr= new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.println( arr[i][j]);
            }
        }
        MergeInterval_13_Leetcode mo=new MergeInterval_13_Leetcode();
        System.out.println(mo.merge(arr));

    }


    // brute  force approach (sorting)
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) return intervals;
        Arrays.sort(intervals,(arr1,arr2) -> Integer.compare(arr1[0],arr2[0]));
        List<int[]> out= new ArrayList<>();
        int[] current_interval = intervals[0];
        out.add(current_interval);
        for (int[] interval : intervals){
            int begin=current_interval[0];
            int end=current_interval[1];
            int next_begin=interval[0];
            int next_end=interval[1];
            if(end>=next_begin){
                current_interval[1]=Math.max(end,next_end);
            }else{
                current_interval=interval;
                out.add(current_interval);
            }
        }
     return  out.toArray(new int[out.size()][]);
    }
}
