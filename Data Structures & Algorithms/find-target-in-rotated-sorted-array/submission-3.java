class Solution {
    public int findMin(int[] nums){
        int l=0, r=nums.length-1;

        while(l<r){
            int mid=l+(r-l)/2;

            if(nums[mid]>nums[r]){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }

        return l;
    }

    public int bs(int[] nums, int target, int l, int r){
        while(l<=r){
            int mid=l+(r-l)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }

        return -1;
    }

    public int search(int[] nums, int target) {
        int min=findMin(nums);
        int n=nums.length;
        if(target>nums[n-1]){
            return bs(nums, target, 0, min);
        }
        return bs(nums, target, min, n-1);
    }
}
