class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int l=0, r=n-1;
        int area=0;

        while(l<r){
            int h=Math.min(heights[l], heights[r]);
            int b=r-l;

            int a=b*h;
            area=Math.max(a, area);

            if(l<r && heights[l]>heights[r]) r--;
            else l++;
        }

        return area;
    }
}
