class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();

        if(n==0 || n==1) return n;

        HashSet<Character> set=new HashSet<>();

        int i=0, j=0;
        int maxc=1;

        while(j<n){
            while(set.contains(s.charAt(j))){
                set.remove((s.charAt(i)));
                i++;
            }

            set.add(s.charAt(j));
            maxc=Math.max(maxc, j-i+1);
            j++;
        }

        return maxc;
    }
}
