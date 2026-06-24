class Solution {
    public void merge(int[] a, int right, int mid, int left){
        int n1=mid-left+1;
        int n2=right-mid;

        int[] l=new int[n1];
        int[] r=new int[n2];

        for(int i=0; i<n1; i++){
            l[i]=a[left+i];
        }

        for(int i=0; i<n2; i++){
            r[i]=a[mid+i+1];
        }

        int i=0, j=0, k=left;

        while(i<n1 && j<n2){
            if(l[i]<=r[j]){
                a[k++]=l[i++];
            }
            else{
                a[k++]=r[j++];
            }
        }

        while(i<n1){
            a[k++]=l[i++];
        }

        while(j<n2){
            a[k++]=r[j++];
        }
    }

    public void mergeSort(int[] a, int right, int left){
        if(left>=right) return;

        int mid=left+(right-left)/2;

        mergeSort(a, mid, left);
        mergeSort(a, right, mid+1);

        merge(a, right, mid, left);
    }

    public int[] sortArray(int[] nums) {
        int n=nums.length;

        mergeSort(nums, n-1, 0);

        return nums;
    }
}