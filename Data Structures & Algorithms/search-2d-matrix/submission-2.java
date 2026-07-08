class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        if(target<matrix[0][0] || target>matrix[m-1][n-1]) return false;

        int l1=0, r1=m-1;
        int mid1=0;
        while(l1<=r1){
            mid1=l1+(r1-l1)/2;

            if(target==matrix[mid1][0]) return true;
            else if(target<matrix[mid1][0]){
                r1=mid1-1;
            }
            else{
                l1=mid1+1;
            }
        }

        int l2=0, r2=n-1;
        while(l2<=r2){
            int mid2=l2+(r2-l2)/2;

            if(matrix[r1][mid2]==target) return true;
            else if(matrix[r1][mid2]>target){
                r2=mid2-1;
            }
            else{
                l2=mid2+1;
            }
        }

        return false;
    }
}
