/*
 * Problem #1925: Count Square Sum Triples
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 12/8/2025, 1:19:01 PM
 * Link: https://leetcode.com/problems/count-square-sum-triples/
 */

class Solution {
    public int countTriples(int n) {

        int maxSquare = n*n;
        boolean[] isSquare = new boolean[maxSquare+1];
        for(int i=1;i<=n;i++) {
            isSquare[i*i]=true;
        }
        int res=0;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                int sum = (i*i) + (j*j);
                
                if(sum<=maxSquare && isSquare[sum]){
                    res++;
                }
            }
        }
        return res;
    }
}
