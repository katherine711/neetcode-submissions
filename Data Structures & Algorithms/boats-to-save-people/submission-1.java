class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n=people.length;
        int count=0;

        Arrays.sort(people);

        int l=0, r=n-1;

        while(l<=r){
            int sum=people[l]+people[r];
            if(sum<=limit){
                count++;
                l++; r--;
            }
            else{
                count++;
                r--;
            }
        }

        return count;
    }
}