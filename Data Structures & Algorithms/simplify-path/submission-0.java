class Solution {
    public String simplifyPath(String path) {
        int n=path.length();
        Stack<String> st=new Stack<>();

        for(String dir: path.split("/")){
            if(dir.equals(".") || dir.equals("")){
                continue;
            }
            else if(dir.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                st.push(dir);
            }
        }

        if(st.isEmpty()) return "/";

        StringBuilder s=new StringBuilder();

        while(!st.isEmpty()){
            s.insert(0, "/"+st.pop());
        }

        return s.toString();
    }
}