class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int low=0,high=(row*col)-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int curr=matrix[mid / col][mid % col];
            if (curr==target){
                return true;
            } else if(curr>target) high=mid-1;
            else low=mid+1;
        }
        return false;
        
    }
}