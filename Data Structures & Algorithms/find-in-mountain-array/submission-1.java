/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n=mountainArr.length();

        int l=0, r=n-1;
        int peak=0;

        while(l<=r){
            int mid=l+(r-l)/2;

            if(mountainArr.get(mid)>mountainArr.get(mid+1) && mountainArr.get(mid-1)<mountainArr.get(mid)){
                peak=mid; break;
            }
            else if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }

        l=0;
        r=peak;

        while(l<=r){
            int mid=l+(r-l)/2;
            if(target==mountainArr.get(mid)){
                return mid;
            }
            else if(target<mountainArr.get(mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }

        l=peak;
        r=n-1;

        while(l<=r){
            int mid=l+(r-l)/2;
            if(target==mountainArr.get(mid)){
                return mid;
            }
            else if(target>mountainArr.get(mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }

        return -1;
    }
}