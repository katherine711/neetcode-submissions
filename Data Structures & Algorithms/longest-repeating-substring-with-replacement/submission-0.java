class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();

        int[] freq=new int[26];

        int i=0, j=0, maxf=0, res=0;

        while(i<=j && j<n){
            freq[s.charAt(j)-'A']++;
            maxf=Math.max(maxf, freq[s.charAt(j)-'A']);

            while(((j-i+1)-maxf)>k){
                freq[s.charAt(i)-'A']--;
                i++;
            }

            res=Math.max(res, j-i+1);
            j++;
        }

        return res;
    }
}
