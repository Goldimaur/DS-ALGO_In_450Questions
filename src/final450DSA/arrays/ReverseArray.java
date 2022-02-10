package final450DSA.arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();

        }
        System.out.println("***original array***");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);

        }
        System.out.println("***reverse array***");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

    }
}
