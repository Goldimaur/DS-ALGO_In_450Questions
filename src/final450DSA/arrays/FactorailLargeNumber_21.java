package final450DSA.arrays;
/*
Factorials of large numbers
Given an integer N, find its factorial.

Example 1:

Input: N = 5
Output: 120
Explanation : 5! = 1*2*3*4*5 = 120
Example 2:

Input: N = 10
Output: 3628800
Explanation :
10! = 1*2*3*4*5*6*7*8*9*10 = 3628800
 */
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class FactorailLargeNumber_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(factorial(n));
    }
    static ArrayList<Integer> factorial(int N){
        ArrayList<Integer> arrayList = new ArrayList<>();
        // array contingous anf linkedlist non congiouus
        BigInteger factorial = new BigInteger("1");
        for (int i = 2; i <= N; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        String temp = factorial.toString();

        for (int i = 0; i < temp.length(); i++) {
            int number = Integer.parseInt(String.valueOf(temp.charAt(i)));
            arrayList.add(number);
        }
        return arrayList;


    }
}
