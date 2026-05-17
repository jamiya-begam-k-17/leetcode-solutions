/*
 * Problem #150: Evaluate Reverse Polish Notation
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 12/3/2025, 3:08:25 PM
 * Link: https://leetcode.com/problems/evaluate-reverse-polish-notation/
 */

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<tokens.length;i++) {
            String t = tokens[i];

            if(t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) {
                int b = st.pop();
                int a = st.pop();
                if (t.equals("+")) st.push(a + b);
                else if (t.equals("-")) st.push(a - b);
                else if (t.equals("*")) st.push(a * b);
                else if (t.equals("/")) st.push(a / b);
                
            } else {
                st.push(Integer.parseInt(t));
            }
        }
        return st.pop();
    }
}
