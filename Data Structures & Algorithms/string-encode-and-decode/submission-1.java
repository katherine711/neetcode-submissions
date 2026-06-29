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
            StringBuilder sb=new StringBuilder();
            String s="";
            while(str.charAt(i)!='#'){
                s+=str.charAt(i);
                i++;
            }
            int len=Integer.parseInt(s);

            for(int j=i+1; j<len+i+1; j++){
                sb.append(str.charAt(j));
            }

            i=i+len+1;

            l.add(sb.toString());
        }

        return l;
    }
}
