package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchIceCreamParlor {



    public static void main(String[] args){


        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n, m;
        for(int test = 0; test < t; test++){
            m = in.nextInt();
            n = in.nextInt();
            IceCream[] arr = new IceCream[n];

            for(int i=0; i<n; i++){
                arr[i] = new IceCream(in.nextInt(), i+1);
            }

            Arrays.sort(arr);

            for(int i=0; i<n; i++){
                int searchFor = m - arr[i].flavor;
                if(searchFor >= arr[i] .flavor){
                    int index = binarySearch(i+1, n-1, arr, searchFor);
                    if(index != -1){
                        System.out.println(Math.min(arr[i].index, index) +" " + Math.max(arr[i].index, index));
                        break;
                    }
                }
            }

        }
    }

    public static int binarySearch(int start, int end, IceCream[] arr, int search){

        int mid;
        while(start <= end){
            mid = start + (end-start)/2;
            if(arr[mid].flavor == search){
                return arr[mid].index; //index is returned
            }else if(arr[mid].flavor < search){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return -1; //not found
    }
}

class IceCream implements Comparable{
    int flavor;
    int index;

    public IceCream(int flavor, int index) {
        this.flavor = flavor;
        this.index = index;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof IceCream){
            IceCream comp = (IceCream) o;
            return this.flavor - comp.flavor;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof IceCream){
            return this.flavor == ((IceCream)o).flavor;
        }
        return false;
    }
}
