class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        int n=strs.length;

        int min=strs[0].length();
        int idx=0;
        for(int i=1; i<n; i++){
            if(strs[i].length()<min){
                min=strs[i].length();
                idx=i;
            }
        }

        String temp=strs[0];
        strs[0]=strs[idx];
        strs[idx]=temp;

        int j=0;

        while(j<strs[0].length()){
            int count=0;
            int flag=0;
            for(int i=1; i<n; i++){
                if(strs[0].charAt(j)==strs[i].charAt(j)){
                    count++;
                }
                else{
                    flag=1;
                    break;
                }
            }

            if(flag==1) break;

            if(count==n-1){
                sb.append(strs[0].charAt(j));
                j++;
            }
        }
        
        return sb.toString();
    }
}