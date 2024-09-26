import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

class Node {
    Map<Character, Pair> mp = new HashMap<>();
    boolean is_End = false;
}

class Pair {
    int count;
    Node node;

    Pair(int count, Node node) {
        this.count = count;
        this.node = node;
    }
}

class Trie {
    private Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String s) {
        Node curr = root;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Check if the character is not present
            if (!curr.mp.containsKey(c)) {
                curr.mp.put(c, new Pair(0, new Node())); // Create a new Pair
            }
            curr.mp.get(c).count++; // Increment count
            curr = curr.mp.get(c).node; // Move to the next node
        }
        curr.is_End = true; // Mark the end of the word
    }

    public int checkPrefixCount(String s) {
        Node curr = root;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!curr.mp.containsKey(c)) {
                break; // If the character is not found, break
            }
            count += curr.mp.get(c).count; // Add count of this prefix
            curr = curr.mp.get(c).node; // Move to the next node
        }
        return count; // Return total prefix count
    }
}

public class PrefixScores {
    public int[] sumPrefixScores(String[] strings) { 
        Trie trie = new Trie();
        for (String str : strings) {
            trie.insert(str); 
        }
        
        int[] ans = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            ans[i] = trie.checkPrefixCount(strings[i]); 
        }
        return ans; // Return the results array
    }

    public static void main(String[] args) {
        PrefixScores ps = new PrefixScores();
        String[] strings = {"a","ab","abc","cab"}; 
        int[] result = ps.sumPrefixScores(strings);
        
        System.out.println(Arrays.toString(result)); 
    }
}
