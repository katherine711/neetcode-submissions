class Solution {
    public int subarraySum(int[] nums, int k) {
        //int n=nums.length;
        int sum=0, count=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(0, 1);

        for(int num : nums){
            sum+=num;
            int diff=sum-k;

            count+=map.getOrDefault(diff, 0);
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }

        return count;
    }
}