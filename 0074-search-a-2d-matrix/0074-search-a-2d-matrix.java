class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalRow=matrix.length;
        int totalCol=matrix[0].length;

        int left=0;
        int right=totalCol*totalRow-1;

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
    return false;
}

        while(left<=right){
            int mid=left+(right-left)/2;
            int rowIndex=mid/totalCol;
            int colIndex=mid%totalCol;

            if(matrix[rowIndex][colIndex]==target){
                return true;
            }else if(matrix[rowIndex][colIndex]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return false;
    }
}