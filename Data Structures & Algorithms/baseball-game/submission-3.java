class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        int n=operations.length;

        for(int i=0; i<n; i++){
            String s=operations[i];
            if(s.length()==1){
                char c=s.charAt(0);

                if(c-'0'>=0 && c-'0'<=9){
                    st.push(c-'0');
                }
                else if(c=='+'){
                    int num1=st.pop();
                    int num2=st.pop();
                    int sum=num1+num2;
                    st.push(num2);
                    st.push(num1);
                    st.push(sum);
                }
                else if(c=='C'){
                    st.pop();
                }
                else if(c=='D'){
                    int num=st.peek();
                    num=num*2;
                    st.push(num);
                }
                else{
                    continue;
                }
            }
            else{
                int num=Integer.parseInt(s);
                st.push(num);
            }
        }

        int res=0;
        while(!st.isEmpty()){
            res+=st.pop();
        }

        return res;
    }
}