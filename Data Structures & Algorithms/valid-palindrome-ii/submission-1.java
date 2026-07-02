class Solution {
    public boolean isPal(String s) {
        int f = 0, b = s.length() - 1;

        while (f < b) {
            if (s.charAt(f) != s.charAt(b)) {
                return false;
            }
            f++;
            b--;
        }

        return true;
    }

    public boolean validPalindrome(String s) {

        if (isPal(s))
            return true;

        int f = 0, b = s.length() - 1;

        while (f < b) {

            if (s.charAt(f) != s.charAt(b)) {

                String temp = s.substring(0, b) + s.substring(b + 1);
                if (isPal(temp))
                    return true;

                temp = s.substring(0, f) + s.substring(f + 1);
                if (isPal(temp))
                    return true;

                return false;   
            }

            f++;
            b--;
        }

        return true;
    }
}