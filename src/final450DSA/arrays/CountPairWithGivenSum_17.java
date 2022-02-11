package final450DSA.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Count pairs with given sum
Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.


Example 1:

Input:
N = 4, K = 6
arr[] = {1, 5, 7, 1}
Output: 2
Explanation:
arr[0] + arr[1] = 1 + 5 = 6
and arr[1] + arr[3] = 5 + 1 = 6.
 */
public class CountPairWithGivenSum_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        CountPairWithGivenSum_17 c= new CountPairWithGivenSum_17();
        System.out.println(c.getPairsCount(array, n,k));
    }
    // tc=o(^2) ( brute force)
    // simply use 2 loop inner and outer ( 1 5 7 1)
    // for 1: (1,5) , (1,7) , (1.1)
    // for 5 : (5,7) , (5,1)
    // unordered map ( o(1)
    // ordered map nlogn ( c++)
     //1 5 7 1
    // for 1: 6-1=5  check 5 is present

    int getPairsCount(int[] arr, int n, int k) {
        int res=0;
        Map<Integer,Integer> map= new HashMap<>();
        for (int i: arr){
            map.compute(i,(ke,v) ->{
            if(v == null) return 1;
            return v+1;
            });
        }
        for (int element: arr){
            if(2*element == k)
                res+= Math.max(map.getOrDefault(element,0)- 1,0);
            else
                res +=map.getOrDefault(k-element,0);
        }
        return res/2;
    }

//            HashMap<Integer, Integer> hashMap = new HashMap<>();
//            int count = 0;
//            for (int value : arr) {
//                if (hashMap.containsKey(k - value)) {
//                    count += hashMap.get(k - value);
//                }
//                hashMap.put(value, hashMap.getOrDefault(value, 0) + 1);
//            }
//            return count;
//        }
}
