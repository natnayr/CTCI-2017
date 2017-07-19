package DataStructures;

import java.util.Scanner;

public class StringsMakingAnagrams {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String first = in.next();
        String second = in.next();
        System.out.println(differenceNumber(first, second));
    }

    public static int differenceNumber(String first, String second){
        int numAZ = 'z'+1-'a';
        int[] arr = new int[numAZ];
        int[] arr2 = new int[numAZ];

        for(int i=0; i<first.length(); i++){
            arr[first.charAt(i)-'a']++;
        }

        for(int i=0; i<second.length(); i++){
            arr2[second.charAt(i)-'a']++;
        }

        int count = 0;
        for(int i=0; i<arr.length; i++){
            count += Math.abs(arr[i] - arr2[i]);
        }

        return count;
    }
}
