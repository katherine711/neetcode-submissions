class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            for(int i=0; i<n; i++){
                nums1[i]=nums2[i];
            }
            return;
        }

        int j=0;

        while(j<n){
            int i=0;
            while(i<m && nums2[j]>nums1[i]){
                i++;
            }

            for(int k=m-1; k>=i; k--){
                nums1[k+1]=nums1[k];
            }

            nums1[i]=nums2[j];
            m++;
            j++;
        }
    }
}