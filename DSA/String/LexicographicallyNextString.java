public class LexicographicallyNextString {
    public static void main(String[] args) {
        String str="zzz";
         String nextStr =lexicographicallyNextString(str);
         System.out.println(nextStr);
    }
    public static String lexicographicallyNextString(String str) {
        if (str.equals("")) {
            return "a";
        }
        
        int n = str.length() - 1;
        while (n >= 0 && str.charAt(n) == 'z') {
            n--;
        }
        
        if (n == -1) {
            return str + "a";
        } else {
            char nextChar = (char) (str.charAt(n) + 1);
            str = str.substring(0, n) + nextChar + str.substring(n + 1);
            return str;
        }
    }
    
}
