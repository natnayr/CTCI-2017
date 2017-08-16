package HackerRank.TechniquesAndConcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RecursionDavisStaircase {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int times=0; times<n; times++){
            System.out.println(numWays(in.nextInt()));
        }

    }

    private static Map<Integer, Integer> map = new HashMap<>();

    public static int numWays(int n){

        if(n < 0 ){
            return 0;
        }
        if(n == 0){
            return 1;
        }

        if(!map.containsKey(n)){
            int count = numWays(n-1) + numWays(n-2) + numWays(n-3);
            map.put(n, count);
        }
        return map.get(n);
    }
}
