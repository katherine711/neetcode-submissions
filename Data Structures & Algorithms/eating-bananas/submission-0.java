class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int r=piles[0], l=1;

        for (int pile : piles) {
            r=Math.max(r, pile);
        }

        while(l<=r){
            int mid=(l+r)/2;

            long hours=0;
            for(int i=0; i<n; i++){
                hours+=(piles[i]+mid-1)/mid;
            }

            if(hours<=h){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }

        return l;
    }
}
