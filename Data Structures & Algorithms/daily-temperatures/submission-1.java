class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;

        int[] op=new int[n];
        Stack<Integer> st=new Stack<>();

        /*for(int i=0; i<n-1; i++){
            int t1=temperatures[i];
            int j=i+1;
            while(j<n){
                int t2=temperatures[j];
                if(t2>t1){
                    op[i]=j-i;
                    break;
                }
                j++;
            }
            if(j==n){
                op[i]=0;
            }
        }

        op[n-1]=0;*/

        for(int i=0; i<n; i++){
            int t=temperatures[i];
            while(!st.isEmpty() && temperatures[st.peek()]<t){
                int idx=st.pop();
                op[idx]=i-idx;
            }
            st.push(i);
        }

        return op;
    }
}
