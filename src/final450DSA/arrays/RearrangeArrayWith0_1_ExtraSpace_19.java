package final450DSA.arrays;
/*
Rearrange array in alternating positive & negative items with O(1) extra space | Set 1

Given an array of positive and negative numbers, arrange them in an alternate fashion such that every positive number is followed by negative and vice-versa maintaining the order of appearance.
Number of positive and negative numbers need not be equal. If there are more positive numbers they appear at the end of the array. If there are more negative numbers, they too appear in the end of the array.

Examples :

Input:  arr[] = {1, 2, 3, -4, -1, 4}
Output: arr[] = {-4, 1, -1, 2, 3, 4}

Input:  arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
output: arr[] = {-5, 5, -2, 2, -8, 4, 7, 1, 8, 0}
 */
import java.util.Scanner;

public class RearrangeArrayWith0_1_ExtraSpace_19 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        RearrangeArrayWith0_1_ExtraSpace_19 r= new RearrangeArrayWith0_1_ExtraSpace_19();
        r.rearrange(array,n);
        r.printArray(array,n);
    }

    void rightrotate(int arr[], int from, int to,int cur)
    {
        int tmp = arr[cur];
        for (int i = cur; i > to; i--)
            arr[i] = arr[i - 1];
        arr[to] = tmp;
    }

    void rearrange(int arr[], int n)
    {

        // brute force approch -> 2 array positive and negative and 3 array ( put alternate  value)
        //2 approach order tc=o(n) sc=o(1) and unordered
        // use two pointer i(start) and j(end) if i negative and j positive swap ( separate positive and negative value)
        // arrange i =1 j=2 swap (for  alternative value)
        // prev  ( even+ odd- do operation) right rotate
        //            _swap_
        // eg :- -1 1 2 3 -3 : -1 1 -3 2 3
        //
        int wrongIndex = -1;

        for (int index = 0; index < n; index++)
        {
            if (wrongIndex !=-1)
            {

                if (((arr[index] >= 0) && (arr[wrongIndex] < 0)) || ((arr[index] < 0) && (arr[wrongIndex] >= 0))) {
                    // if wrongindex =(+) both value have opposite sign
                    rightrotate(arr, n, wrongIndex, index);
                    if (index - wrongIndex >= 2)
                        wrongIndex = wrongIndex + 2;
                    else
                        wrongIndex = -1;
                }
            }


            if (wrongIndex == -1)
            {

                if (((arr[index] >= 0) && ((index%2) == 0)) || ((arr[index] < 0) && (index & index%2) == 1))
                    // index= odd && currentelement=(-)
                    wrongIndex = index;
            }
        }
    }

    void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
}

