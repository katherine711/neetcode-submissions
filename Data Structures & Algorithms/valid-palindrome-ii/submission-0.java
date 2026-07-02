class Solution {
    public int isPal(String s){
        int n=s.length();

        int f=0, b=n-1;

        while(f<=b){
            if(s.charAt(f)!=s.charAt(b)){
                return 0;
            }

            f++;
            b--;
        }

        return 1;
    }

    public boolean validPalindrome(String s) {
        int n=s.length();

        if(isPal(s)==1) return true;

        int f=0, b=n-1;

        while(f<=b){
            if(s.charAt(f)!=s.charAt(b)){
                String temp=s.substring(0, b)+s.substring(b+1);
                if(isPal(temp)==1) return true;

                String temp1=s.substring(0, f)+s.substring(f+1);
                if(isPal(temp1)==1) return true;
            }

            f++;
            b--;
        }

        return false;
    }
}