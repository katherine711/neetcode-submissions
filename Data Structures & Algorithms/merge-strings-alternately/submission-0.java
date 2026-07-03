class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();

        int n1=word1.length();
        int n2=word2.length();

        int i=0, j=0;

        while(i<n1 && j<n2){
            char ch1=word1.charAt(i);
            char ch2=word2.charAt(j);
            sb.append(ch1);
            sb.append(ch2);

            i++;
            j++;
        }

        if(i<n1){
            for(int k=i; k<n1; k++){
                sb.append(word1.charAt(k));
            }
        }

        if(i<n2){
            for(int k=j; k<n2; k++){
                sb.append(word2.charAt(k));
            }
        }

        return sb.toString();
    }
}