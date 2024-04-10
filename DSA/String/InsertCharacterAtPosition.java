package DSA.String;

public class InsertCharacterAtPosition {
    public static void main(String arg[]){
        String str="geeksforgeeks";
        int []arr={1,5,7,9};
        String s=insertCharacters(str,arr);
        System.out.println(s);
    }
    public static String insertCharacters(String str,int []arr) {
        String ans = "";
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
          if (j < arr.length && i == arr[j]) {
            ans += '*';
            j++;
          }
          ans += str.charAt(i);
        }
        return ans;
    }
}
