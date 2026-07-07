class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=speed.length;
        int[][] cars=new int[n][2];
        Stack<Double> st=new Stack<>();
        int fleets=0;

        for(int i=0; i<n; i++){
            cars[i][0]=position[i];
            cars[i][1]=speed[i];
        }

        Arrays.sort(cars, (a, b) -> b[0]-a[0]);

        for(int i=0; i<n; i++){
            double currTime=(double)(target-cars[i][0])/cars[i][1];

            if(st.isEmpty()){
                st.push(currTime);
            }
            else{
                double fleetTime=st.peek();
                if(currTime<=fleetTime){
                    continue;
                }
                else{
                    st.push(currTime);
                }
            }
        }

        while(!st.isEmpty()){
            st.pop();
            fleets++;
        }

        return fleets;
    }
}
