package HackerRank.Algorithms;

import java.util.*;

public class BFSShortestReachinaGraph {

    public static class Graph{

        List<Integer>[] graph; //array of linked list

        public Graph(int size){
            graph = new LinkedList[size];

            //init graph
            for(int i=0; i<size; i++){
                graph[i] = new LinkedList<Integer>();
            }
        }

        public void addEdge(int first, int second){
            if(!graph[first].contains(second)) graph[first].add(second);

            if(!graph[second].contains(first)) graph[second].add(first);
        }

        public int[] shortestReach(int root){
            int[] result = new int[graph.length];
            Arrays.fill(result, -1);

            Queue<Integer> queue = new LinkedList<>();
            Set<Integer> set = new HashSet<>();

            result[root] = 0;

            set.add(root);
            queue.add(root);

            while(!queue.isEmpty()){
                int current = queue.poll();
                for(int item : graph[current]){
                    if(!set.contains(item)){
                        set.add(item);
                        queue.add(item);
                        result[item] = result[current] + 6;
                    }
                }

            }

            return result;
        }


    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int queries = in.nextInt();

        for(int t=0; t<queries; t++){

            Graph graph = new Graph(in.nextInt());
            int m = in.nextInt();

            for(int q=0; q<m; q++){
                int u = in.nextInt() - 1;
                int v = in.nextInt() - 1;

                graph.addEdge(u, v);
            }

            int startingId = in.nextInt() - 1;
            int[] distances = graph.shortestReach(startingId);

            for(int i=0; i<distances.length; i++){
                if(i != startingId){
                    System.out.print(distances[i]);
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        in.close();
    }
}
