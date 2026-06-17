class Solution {
    public String decodeString(String s) {
        int n = s.length();
        Stack<String> st = new Stack<>();

        int i = 0;

        while (i < n) {

            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {

                StringBuilder sb1 = new StringBuilder();

                while (i < n && Character.isLetter(s.charAt(i))) {
                    sb1.append(s.charAt(i));
                    i++;
                }

                st.push(sb1.toString());
            }

            else if (Character.isDigit(ch)) {

                StringBuilder sb2 = new StringBuilder();

                while (i < n && Character.isDigit(s.charAt(i))) {
                    sb2.append(s.charAt(i));
                    i++;
                }

                st.push(sb2.toString());
            }

            else if (ch == '[') {
                st.push("[");
                i++;
            }

            else if (ch == ']') {

                StringBuilder curr = new StringBuilder();

                while (!st.peek().equals("[")) {
                    curr.insert(0, st.pop());
                }

                st.pop(); 

                int num = Integer.parseInt(st.pop());

                StringBuilder res = new StringBuilder();

                for (int j = 0; j < num; j++) {
                    res.append(curr);
                }

                st.push(res.toString());
                i++;
            }
        }

        StringBuilder ans = new StringBuilder();

        while (!st.isEmpty()) {
            ans.insert(0, st.pop());
        }

        return ans.toString();
    }
}