class Solution {
    int top=-1;

    public void push(int[] a, int ele){
        a[++top]=ele;
    }

    public int pop(int[] a){
        return a[top--];
    }

    public int peek(int[] a){
        return a[top];
    }

    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        int res[]=new int[n];

        for (int i = 0; i < n; i++) {
            int a1 = asteroids[i];
            boolean alive = true;

            while (alive && top != -1 && peek(res) > 0 && a1 < 0) {

                int a2 = peek(res);

                if (Math.abs(a1) > Math.abs(a2)) {
                    pop(res);
                }
                else if (Math.abs(a1) == Math.abs(a2)) {
                    pop(res);
                    alive = false;
                }
                else {
                    alive = false;
                }
            }

            if (alive) {
                push(res, a1);
            }
        }

        return Arrays.copyOf(res, top+1);
    }
}