package LeetCode;

import java.util.List;
import java.util.Scanner;

public class ThreeSum {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] nums = new int[];

        List<List<Integer>> results = threeSum(nums);
        for(List<Integer> setResult : results){
            for(Integer number : setResult){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> threeSum(int[] nums){

        int a=0, b=1, c=2;
        for(int a=0, b=1, c=2){

        }

    }
}
