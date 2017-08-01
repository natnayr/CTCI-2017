package HackerRank.DataStructures;

import java.util.Hashtable;
import java.util.Scanner;

public class HashTablesRansomNote {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        for(int i=0; i<m; i++){

        }
        Hashtable<String, Integer> hashTable = new Hashtable<String, Integer>();

        for(int i=0; i<m; i++) {
            String firstLineWord = in.next();
            int count = hashTable.getOrDefault(firstLineWord, 0) + 1;
            hashTable.put(firstLineWord, count);
        }

        for(int i=0; i<n; i++) {
            String secondLineWord = in.next();
            int count = hashTable.getOrDefault(secondLineWord, 0) - 1;
            if(count >= 0){
                hashTable.put(secondLineWord, count);
            }else{
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
