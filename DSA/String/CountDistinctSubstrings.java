

class TrieNode {
    TrieNode[] children;
    boolean isEndOfWord;

    TrieNode() {
        children = new TrieNode[26];
        isEndOfWord = false;
    }
}

class Trie {
    private TrieNode root;

    Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }

    public int countDistinctSubstrings(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            TrieNode node = root;
            for (int j = i; j < str.length(); j++) {
                int index = str.charAt(j) - 'a';
                if (node.children[index] == null) {
                    count++;
                    node.children[index] = new TrieNode();
                }
                node = node.children[index];
            }
        }
        return count+1;
    }
}

public class CountDistinctSubstrings {
    public static void main(String arg[]) {
        String input = "abab";
        Trie trie = new Trie();
        System.out.println("Number of distinct substrings: " + trie.countDistinctSubstrings(input));
    }
}
