class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // m, n , low, high, r, c, mid

        int m = matrix.length;      //3
        int n = matrix[0].length;   //4
        int low = 0;               //0th index
        int high = m*n-1;           //11th index

        while(low <= high){
            int mid = low + (high-low)/2; //
            int r = mid / n;
            int c = mid % n;

            if(matrix[r][c] == target)
                return true;
            else if(matrix[r][c] >= target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return false;
    }
}