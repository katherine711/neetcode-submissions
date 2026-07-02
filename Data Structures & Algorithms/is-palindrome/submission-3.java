class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();

        int f=0, b=n-1;

        while(f<b){
            while(f<b && !Character.isLetterOrDigit(s.charAt(f))){
                f++;
            }

            while(f<b && !Character.isLetterOrDigit(s.charAt(b))){
                b--;
            }

            if(Character.toLowerCase(s.charAt(f))!=Character.toLowerCase(s.charAt(b))){
                return false;
            }

            f++;
            b--;
        }

        return true;
    }
}
