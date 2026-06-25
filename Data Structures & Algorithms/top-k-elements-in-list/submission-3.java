class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        int[] freq1=new int[2001];
        int[] freq2=new int[2001];

        for(int i=0; i<n; i++){
            if(nums[i]>=0)
                freq1[nums[i]]+=1;
            else
                freq2[Math.abs(nums[i])]+=1;
        }

        int[] res=new int[2001];

        for (int i = 0; i < k; i++) {

            int maxFreq = -1;
            int value = 0;
            boolean negative = false;

            for (int j = 0; j < freq1.length; j++) {
                if (freq1[j] > maxFreq) {
                    maxFreq = freq1[j];
                    value = j;
                    negative = false;
                }
            }

            for (int j = 0; j < freq2.length; j++) {
                if (freq2[j] > maxFreq) {
                    maxFreq = freq2[j];
                    value = j;
                    negative = true;
                }
            }

            res[i] = negative ? -value : value;

            if (negative)
                freq2[value] = 0;
            else
                freq1[value] = 0;
        }

        return Arrays.copyOf(res, k);
    }
}
