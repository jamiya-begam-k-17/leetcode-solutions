package medium;


import java.util.Scanner;
import medium.maxSubString;
import java.util.HashSet;

public class maxSubString {
    public int lengthMaxSubString(String s){
        int start=0,end=0;
        int maxLen=0;
        HashSet<Character> seen=new HashSet<>();

        while(end<s.length()){
            char c=s.charAt(end);
            while(seen.contains(c)){
                seen.remove(s.charAt(start));
                start++;
            }
            seen.add(c);
            int winsize=end-start+1;
            maxLen=Math.max(maxLen,winsize);
            end++;
        }
        return maxLen;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        maxSubString obj = new maxSubString();
        int result = obj.lengthMaxSubString(s);

        System.out.println("Length of longest substring without repeating characters: " + result);
        sc.close();
    }
}
