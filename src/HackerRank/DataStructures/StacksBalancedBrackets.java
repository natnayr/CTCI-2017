package HackerRank.DataStructures;

import java.util.Scanner;
import java.util.Stack;

public class StacksBalancedBrackets {


    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>(); 
        for(int i=0; i<expression.length(); i++){
            char cur = expression.charAt(i);
            if(cur == '{' || cur == '(' || cur == '['){
                stack.push(cur);
            }else if(cur == '}' || cur == ')' || cur == ']'){
                if(stack.empty()) return false;
                char pop = stack.pop();
                if(cur == '}' && pop != '{') return false;
                if(cur == ')' && pop != '(') return false;
                if(cur == ']' && pop != '[') return false;
            }
        }
        if(stack.empty()) {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
        in.close();
    }
}

