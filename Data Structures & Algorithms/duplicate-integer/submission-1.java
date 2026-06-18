class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int n=nums.length;

        if(n==0){
            return false;
        }

        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        int m=Collections.max(map.values());
        if(m>1) return true;
        return false;
    }
}