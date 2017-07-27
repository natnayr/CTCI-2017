package Algorithms;

import java.util.Scanner;

public class SortingBubbleSort {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            arr[a_i] = in.nextInt();
        }

        long totalSwaps = 0;

        for(int i=0; i<n; i++){
            //non-while loop so that no overflow

            int swapsMade = 0;

            for(int j=0; j < n-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    swapsMade++;
                }
            }

            totalSwaps += swapsMade;

            if(swapsMade == 0){
                break;
            }
        }

        System.out.println("Array is sorted in " + totalSwaps + " swaps.");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[arr.length-1]);
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
