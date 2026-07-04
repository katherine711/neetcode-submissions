class Solution {
    public int trap(int[] height) {
        int n=height.length;
        if(n==1){
            return 0;
        }

        int area=0;

        int l=0, r=n-1;
        int maxLeft=height[l];
        int maxRight=height[r];

        while(l<r){
            if(maxLeft<=maxRight){
                l++;
                maxLeft=Math.max(maxLeft, height[l]);
                area+=maxLeft-height[l];
            }
            else{
                r--;
                maxRight=Math.max(maxRight, height[r]);
                area+=maxRight-height[r];
            }
        }

        return area;
    }
}
