package final450DSA.matrix;
/*
74. Search a 2D Matrix
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.


Example 1:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
 */
public class Search2DMatrix_2_leetcode {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0) return false;
        int row=matrix.length;
        int col=matrix[0].length;
        int left=0;
        int right=row*col-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            int mid_element=matrix[mid/col][mid%col];
            if (mid_element==target) return true;
            else if (target<mid_element) right=mid-1;
            else if (target>mid_element) left=mid+1;
        }
         return false;
    }

}
