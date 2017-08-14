package LeetCode;

import java.util.Scanner;

public class LongestPalindromicSubstring {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String word = in.next();

        System.out.println(longestPalindrome(word));

    }


    public static String longestPalindrome(String word){

        for(int i=0, j=0; i<word.length(); i++){

        }

        return null;
    }

    public static boolean isPalindrom(String palin){
        if(palin.length() == 1) return true; //single letter

        if(palin.length() == 2 && palin.charAt(0) == palin.charAt(1)) return true;

        String reverse = new StringBuffer(palin).reverse().toString();

        if(reverse.equals(palin)){
            return true && isPalindrom(palin.substring(1, palin.length()-2));
        }
        return false;


    }





}
