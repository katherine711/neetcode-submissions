class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String s = tokens[i];

            if (s.equals("+") || s.equals("-") ||
                s.equals("*") || s.equals("/")) {

                int num2 = st.pop();
                int num1 = st.pop();

                int res = 0;

                switch (s) {
                    case "+":
                        res = num1 + num2;
                        break;
                    case "-":
                        res = num1 - num2;
                        break;
                    case "*":
                        res = num1 * num2;
                        break;
                    case "/":
                        res = num1 / num2;
                        break;
                }

                st.push(res);
            } else {
                st.push(Integer.parseInt(s));
            }
        }

        return st.pop();
    }
}