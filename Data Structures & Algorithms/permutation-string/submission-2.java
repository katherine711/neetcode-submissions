class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l1=s1.length();
        int l2=s2.length();

        if(l2<l1) return false;

        int[] freq1=new int[26];
        int j=0;

        for(int i=0; i<l1; i++){
            freq1[s1.charAt(i)-'a']++;
        }

        int left=0, right=l1-1;

        while(right<l2){
            int freq2[]=new int[26];
            for(int i=left; i<=right; i++){
                freq2[s2.charAt(i)-'a']++;
            }

            if (Arrays.equals(freq1, freq2)) {
                return true;
            }

            left++;
            right++;
        }

        return false;
    }
}
