class Solution {
    public int findMin(int[] nums){
        int n=nums.length;
        int l=0, r=n-1;

        while(l<r){
            int mid=l+(r-l)/2;

            if(nums[mid]>nums[r]){
                l=mid+1;
            }
            else if(nums[mid]<nums[r]){
                r=mid;
            }
            else{
                r--;
            }
        }

        return l;
    }

    public boolean bs(int[] nums, int target, int l, int r){
        while(l<=r){
            int mid=l+(r-l)/2;

            if(nums[mid]==target){
                return true;
            }
            if (nums[l] == nums[mid] && nums[mid] == nums[r]) {
                l++;
                r--;
            }
            else if (nums[l] <= nums[mid]) {
                if (nums[l] <= target && target < nums[mid])
                    r = mid - 1;
                else
                    l = mid + 1;
            }
            else {
                if (nums[mid] < target && target <= nums[r])
                    l = mid + 1;
                else
                    r = mid - 1;
            }
        }

        return false;
    }

    public boolean search(int[] nums, int target) {
        int min=findMin(nums);
        int n=nums.length;

        if (min == 0) {
            return bs(nums, target, 0, n - 1);
        }
        
        if(target>nums[n-1]){
            return bs(nums, target, 0, min-1);
        }
        return bs(nums, target, min, n-1);
    }
}