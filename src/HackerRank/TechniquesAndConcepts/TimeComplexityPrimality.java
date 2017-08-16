package HackerRank.TechniquesAndConcepts;

import java.util.Scanner;

public class TimeComplexityPrimality {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();

        for(int i=0; i < m; i++){
            int num = in.nextInt();
            if(isPrime(num)){
                System.out.println("Prime");
            }else{
                System.out.println("Not prime");
            }
        }

        in.close();
    }

    public static boolean isPrime(int num){

        if(num == 1) return false;
        if(num == 2) return true;
        if(num%2 == 0) return false; //check evens, always exists

        //if not then just checks odd numbers
        for(int i=3; i*i <= num; i+=2){
            if(num % i == 0) return false;
        }

        return true;
    }
}
