class Solution {

    public String encode(List<String> strs) {
        int n=strs.size();
        if(n==0) return "";

        StringBuilder sb=new StringBuilder();

        for(String s : strs){
            int l=s.length();
            sb.append(l);
            sb.append('#');
            sb.append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        int n=str.length();
        List<String> l=new ArrayList<>();

        if(n==0){
            return l;
        }

        int i=0;

        while(i<n){
            int j=i;
            StringBuilder sb=new StringBuilder();
            while(str.charAt(j)!='#'){
                j++;
            }

            int len=Integer.parseInt(str.substring(i, j));

            j++;

            l.add(str.substring(j, j+len));

            i=j+len;
        }

        return l;
    }
}
