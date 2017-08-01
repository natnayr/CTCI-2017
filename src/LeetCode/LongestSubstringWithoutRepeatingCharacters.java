package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String word = in.next();

        System.out.println(lengthOfLongestSubstring(word));
    }

    public static int lengthOfLongestSubstring(String s){
        if(s.length() == 0)
            return 0;
        Set<Character> set = new HashSet<>();
        int max=0, i=0, j=0;
        int n = s.length();
        while(i<n && j<n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                max = Math.max(max, j-i);
            }else{
                set.remove(s.charAt(i++));
            }
        }

        return max;
    }
}
