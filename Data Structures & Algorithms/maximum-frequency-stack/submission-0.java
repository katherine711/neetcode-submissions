class FreqStack {
    Stack<Integer> st;
    HashMap<Integer, Integer> map=new HashMap<>();
    public FreqStack() {
        st=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        map.put(val, map.getOrDefault(val, 0)+1);
    }
    
    public int pop() {
        int maxKey = -1;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        int index = -1;

        for (int i = st.size() - 1; i >= 0; i--) {
            int val = st.get(i);

            if (map.get(val) == maxValue) {
                index = i;
                break;
            }
        }
        if(index!=-1){
            int removed = st.remove(index);

            map.put(removed, map.get(removed) - 1);

            if (map.get(removed) == 0) {
                map.remove(removed);
            }

            return removed;
        }
        return -1;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */