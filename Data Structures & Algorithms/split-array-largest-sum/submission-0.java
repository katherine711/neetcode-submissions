class Solution {
    public int splitArray(int[] nums, int k) {
        int l=0, r=0;

        for(int num : nums){
            l=Math.max(num, l);
            r+=num;
        }

        while(l<r){
            int mid=l+(r-l)/2;
            
            int n=1;
            int sum=0;
            for(int i=0; i<nums.length; i++){
                sum+=nums[i];
                if(sum>mid){
                    sum=nums[i];
                    n++;
                }
            }

            if(n>k){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }

        return l;
    }
}