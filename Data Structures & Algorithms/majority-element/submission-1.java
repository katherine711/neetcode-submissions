class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int n=nums.length;

        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        int max=Collections.max(map.values());
        int key=-1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue()==max) {
                key = entry.getKey();
                break;
            }
        }

        return key;
    }
}