package final450DSA.matrix;

import java.util.ArrayList;
import java.util.Scanner;

/*
Spirally traversing a matrix
Medium Accuracy: 48.39% Submissions: 80902 Points: 4
Given a matrix of size r*c. Traverse the matrix in spiral form.

Example 1:

Input:
r = 4, c = 4
matrix[][] = {{1, 2, 3, 4},
           {5, 6, 7, 8},
           {9, 10, 11, 12},
           {13, 14, 15,16}}
Output:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
Explanation:

 */
public class SpirallyTraversingmatrix_1 {

    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {
        // 00 01 02 03
        // 10 11 12 13
        // 20 21 22 23
        // 30 31 32 33
        // i==0 && j loop 0 to n
        // j=n && i loop 0 to n
        //  i=n && j loop i to n
        // j=0 && i loop 0 to n
        ArrayList<Integer> spiralMt = new ArrayList<>();
        int startRow = 0, endRow = r - 1, startCol = 0, endCol = c - 1;
        while (startRow <= endRow && startCol <= endCol) {
            for (int i = startCol; i <= endCol; i++) {
                spiralMt.add(matrix[startRow][i]);
            }
            startRow++;

            for (int i = startRow; i <= endRow; i++) {
                spiralMt.add(matrix[i][endCol]);
            }
            endCol--;
            if (startRow <= endRow) {
                for (int i = endCol; i >= startCol; i--) {
                    spiralMt.add(matrix[endRow][i]);
                }
                endRow--;

            }
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    spiralMt.add(matrix[i][startCol]);
                }
                startCol++;
            }
        }
        return spiralMt;
    }


}
