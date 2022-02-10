package final450DSA.arrays;

import java.util.Scanner;

// 2question
public class MinMaxInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int min = 0, max = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("Min" + min + "    MAX" + max);
    }
}
