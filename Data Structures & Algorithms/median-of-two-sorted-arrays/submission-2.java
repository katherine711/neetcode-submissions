class Solution {
    public void mergeSort(int[] a, int[] b, int[] c){
        int m=a.length;
        int n=b.length;

        int i=0, j=0, k=0;

        while(i<m && j<n){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
            }
            else{
                c[k]=b[j];
                j++;
            }

            k++;
        }

        while(i<m){
            c[k]=a[i];
            i++;
            k++;
        }

        while(j<n){
            c[k]=b[j];
            k++;
            j++;
        }
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;

        int k=m+n;

        int[] c=new int[k];

        mergeSort(nums1, nums2, c);

        if(k%2==0){
            double res=(double)(c[k/2-1]+c[k/2])/2;
            return res;
        }
        double res=(double)c[(k+1)/2-1];
        return res;
    }
}
