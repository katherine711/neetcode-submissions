class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;

        if(n==1) return 0;

        int max=0;
        int minPrice=Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            minPrice=Math.min(minPrice, prices[i]);
            int profit=prices[i]-minPrice;
            max=Math.max(max, profit);
        }

        return max;
    }
}
