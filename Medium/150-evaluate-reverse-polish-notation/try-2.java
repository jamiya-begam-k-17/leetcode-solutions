/*
 * Problem #150: Evaluate Reverse Polish Notation
 * Difficulty: Medium
 * Submission: Try 2
 * status: Accepted
 * Language: java
 * Date: 12/3/2025, 3:08:45 PM
 * Link: https://leetcode.com/problems/evaluate-reverse-polish-notation/
 */

class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> st = new ArrayDeque<>();

        for (String t : tokens) {
            switch (t) {
                case "+":
                    st.push(st.pop() + st.pop());
                    break;
                case "-": {
                    int b = st.pop();
                    int a = st.pop();
                    st.push(a - b);
                    break;
                }
                case "*":
                    st.push(st.pop() * st.pop());
                    break;
                case "/": {
                    int b = st.pop();
                    int a = st.pop();
                    st.push(a / b);
                    break;
                }
                default:
                    st.push(Integer.parseInt(t));
            }
        }

        return st.pop();
    }
}

