class Solution {
    public void reverseString(char[] s) {
        int n=s.length;

        int f=0, b=n-1;

        while(f<=b){
            char temp=s[f];
            s[f]=s[b];
            s[b]=temp;

            f++;
            b--;
        }
    }
}