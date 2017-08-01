package LeetCode;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int target = in.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = in.nextInt();
        }

        int[] result = twoSum(nums, target);
        if(result != null) {
            System.out.println(result[0] + " " + result[1]);
        }
    }

    public static int[] twoSum (int[] nums, int target){

        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int toFindNum = target - nums[i];
            if(map.containsKey(toFindNum)){
                result[0] = Math.min(i, map.get(toFindNum));
                result[1] = Math.max(i, map.get(toFindNum));
                return result;
            }
            map.put(nums[i], i);
        }

        return result;
    }
}
