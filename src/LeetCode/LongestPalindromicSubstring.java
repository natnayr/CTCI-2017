package LeetCode;

import java.util.Scanner;

public class LongestPalindromicSubstring {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String word = in.next();

        System.out.println(longestPalindrome(word));

    }


    public static String longestPalindrome(String word){

        String reverse = new StringBuffer(word).reverse().toString().trim();

        if(word.length() == 0 || reverse.length() == 0) return null;

        int m = word.length();
        int n = reverse.length();
        int[][] map = new int[m+1][n+1];
        int max = 0, max_first=0;
        for(int i=0; i<=m; i++){
            for(int j=0; j<=n; j++){
                if(i == 0 || j == 0){
                    map[i][j] = 0;
                }else if(word.charAt(i-1) == reverse.charAt(j-1)){

                    //check original indices is here
                    map[i][j] = map[i - 1][j - 1] + 1;
                    if (max < map[i][j]) {
                        max = map[i][j];
                        max_first = i;
                    }

                }else{
                    map[i][j] = 0;
                }
            }
        }

        return word.substring(max_first-max, max_first);
    }





}
