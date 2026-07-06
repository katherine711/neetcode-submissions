class MyQueue {
    int n=1000;
    int top=-1;
    int[] st;
    public MyQueue() {
        st=new int[n];
    }
    
    public void push(int x) {
        for (int i = top; i >= 0; i--) {
            st[i + 1] = st[i];
        }

        st[0] = x;
        top++;
    }
    
    public int pop() {
        return st[top--];
    }
    
    public int peek() {
        return st[top];
    }
    
    public boolean empty() {
        return top==-1;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */