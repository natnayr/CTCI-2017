package HackerRank.DataStructures;

import java.util.*;

public class TriesContracts {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Trie trie = new Trie();

        for (int rep = 0; rep < n; rep++) {
            String command = in.next();
            String word = in.next();

            switch (command) {
                case "add":
                    trie.insert(word);
                    break;
                case "find":
                    System.out.println(trie.findCount(word));
                    break;
            }
        }
    }

    static class Trie {
        private TrieNode root;

        public Trie(){
            root = new TrieNode();
        }

        public void insert(String word){
            HashMap<Character, TrieNode> children = root.children;

            for(int i=0; i<word.length(); i++){
                char c = word.charAt(i);

                TrieNode t;
                if(children.containsKey(c)){
                    t = children.get(c);
                    t.count++;
                }else{
                    t = new TrieNode(c);
                    children.put(c, t);
                }

                if(i == word.length()-1) {
                    t.isLeaf = true;
                }
            }
        }

        public int findCount(String word){
            TrieNode t = findNode(word);

            if(t != null){
                return t.count;
            }else{
                return 0;
            }
        }

        public TrieNode findNode(String str){
            Map<Character, TrieNode> children = root.children;
            TrieNode t = null;
            for(int i=0; i<str.length(); i++){
                char c = str.charAt(i);
                if(children.containsKey(c)){
                    t=children.get(c);
                    children = t.children;
                }else{
                    return null;
                }
            }
            return t;
        }

    }

    static class TrieNode {
        char c;
        HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
        int count;
        boolean isLeaf;

        public TrieNode(){}

        public TrieNode(char c){
            this.count = 1;
            this.c = c;
        }
    }

}




