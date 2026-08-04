class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;

        int r=0;

        for(int w : weights){
            r+=w;
        }

        int l=0;
        for(int w : weights){
            l=Math.max(l, w);
        }

        while(l<=r){
            int d=1;
            int mid=l+(r-l)/2;

            int sum=0;
            for(int i=0; i<n; i++){
                if(sum+weights[i]>mid){
                    sum=weights[i];
                    d++;
                }
                else{
                    sum+=weights[i];
                }
            }

            if(d>days){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }

        return l;
    }
}