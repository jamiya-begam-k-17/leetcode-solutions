/*
 * Problem #1441: Build an Array With Stack Operations
 * Difficulty: Medium
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 12/3/2025, 2:37:05 PM
 * Link: https://leetcode.com/problems/build-an-array-with-stack-operations/
 */

class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int len = target.length;
        int j = 0;
        for(int i=1;i<=n;i++) {
            if(i==target[j]){
                j++;
                list.add("Push");
                if(j==len){
                    break;
                }
            
            } else {
                list.add("Push");
                list.add("Pop");
            }
        }
        return list;
    }
}
