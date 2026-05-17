/*
 * Problem #242: Valid Anagram
 * Difficulty: Easy
 * Submission: Try 1
 * status: Accepted
 * Language: java
 * Date: 2/26/2026, 7:58:40 AM
 * Link: https://leetcode.com/problems/valid-anagram/
 */

class Solution {
    public boolean isAnagram(String s, String t) {
        int a = s.length();
        int b = t.length();
        if(a!=b) return false;

        Map<Character,Integer> counter = new HashMap<>();

        for(int i=0;i<a;i++) {
            char ch = s.charAt(i);
            counter.put(ch, counter.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<b;i++) {
            char ch = t.charAt(i);
            if(!counter.containsKey(ch) || counter.get(ch)==0) {
                return false;
            }
            counter.put(ch, counter.get(ch)-1);
        }
        return true;
    }
}
