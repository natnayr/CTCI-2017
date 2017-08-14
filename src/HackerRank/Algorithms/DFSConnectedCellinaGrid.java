package HackerRank.Algorithms;

import java.util.Scanner;

public class DFSConnectedCellinaGrid {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int grid[][] = new int[n][m];
        for(int grid_i = 0; grid_i < n; grid_i++){
            for(int grid_j = 0; grid_j < n; grid_j++) {
                grid[grid_i][grid_j] = in.nextInt();
            }
        }

        System.out.println(getBiggestRegion(grid));

    }

    public static int getBiggestRegion(int[][] grid){
        int count = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                count = Math.max(count, markAndCount(i, j, grid));
            }
        }

        return count;
    }

    public static int markAndCount(int i, int j, int[][] grid){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length){
            return 0;
        }

        if(grid[i][j] == 1){
            grid[i][j] = 0;
            return 1 + markAndCount(i+1, j, grid) + markAndCount(i, j+1, grid) +
                    markAndCount(i+1, j+1, grid) + markAndCount(i-1, j-1, grid) +
                    markAndCount(i-1, j, grid) + markAndCount(i, j-1, grid) +
                    markAndCount(i-1, j+1, grid) + markAndCount(i+1, j-1, grid);
        }else{
            return 0;
        }
    }
}
