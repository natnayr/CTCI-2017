package HackerRank.DataStructures;

import java.util.Scanner;
import java.util.Stack;

public class QueuesATaleOfTwoStacks {

    public static class MyQueue<T>{
        Stack<T> stackFirst = new Stack<T>();
        Stack<T> stackSecond = new Stack<T>();

        public void enqueue(T value){
            stackFirst.push(value);
        }

        public T peek(){
            if(!stackSecond.empty()){
                return stackSecond.peek();
            }

            //else empty over
            while(!stackFirst.empty()) {
                stackSecond.push(stackFirst.pop());
            }

            if(!stackSecond.empty()){
                return stackSecond.peek();
            }else {
                return null;
            }
        }

        public T dequeue(){
            //peek to perform transfer
            peek();

            return stackSecond.pop();
        }
    }

    public static void main(String[] args){
        MyQueue<Integer> queue = new MyQueue<Integer>();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for(int i=0; i<n; i++){
            int operation = in.nextInt();
            if(operation == 1){
                queue.enqueue(in.nextInt());  //enqueue item
            }else if(operation == 2){
                queue.dequeue();  //dequeue only
            }else if(operation == 3){
                System.out.println(queue.peek()); //peek
            }
        }

        in.close();

    }
}
