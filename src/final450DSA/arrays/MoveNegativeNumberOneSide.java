package final450DSA.arrays;

import java.util.Scanner;
// 5 question
public class MoveNegativeNumberOneSide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();

        }
        moveNegativeNumberOneSide(array,n);
    }
    static void moveNegativeNumberOneSide(int arr[], int n)
    {
        int  temp;
        for (int i = 0; i < n; i++) {
            for (int j=0;j<n;j++){
            if (arr[i] < 0) {
                if (i != j) {
                    //store array
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);

        }
    }
}
