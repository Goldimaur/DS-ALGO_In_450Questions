package final450DSA.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
Chocolate Distribution Problem
Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are M students, the task is to distribute chocolate packets among M students such that :
1. Each student gets exactly one packet.
2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.
 */
public class ChocolateDistributionProblem_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();

        ArrayList<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Long val=scanner.nextLong();
            list.add(val);

        }
        long m= scanner.nextLong();
        ChocolateDistributionProblem_29 c= new ChocolateDistributionProblem_29();
        System.out.println(c.findMinDiff(list,n,m));
    }
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        // 2 pointer technique
        // sort i-m < m
        Collections.sort(a);
        long mindif=Long.MAX_VALUE;
        for (int i=0;i+m-1< n;i++){
            mindif=Math.min(a.get(i+(int)m-1)-a.get(i),mindif);
        }
        return mindif;
    }
}
