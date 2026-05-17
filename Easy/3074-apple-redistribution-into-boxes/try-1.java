/*
 * Problem #3074: Apple Redistribution into Boxes
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 12/24/2025, 6:12:56 PM
 * Link: https://leetcode.com/problems/apple-redistribution-into-boxes/
 */

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int n=apple.length;
        int m=capacity.length;
        int size=0;
        int count=0;
        for(int i=0;i<n;i++) {
            size+=apple[i];
        }
        for(int i=m-1;i>=0;i--) {
            int c = capacity[i];
            count+=1;
            size-=c;
            if(size<=0) {
                break;
            }
        }
        return count;
    }
}
