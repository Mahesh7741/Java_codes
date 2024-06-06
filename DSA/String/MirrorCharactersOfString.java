public class MirrorCharactersOfString {
    public static void main(String[] args) {
        String input="paneumonia";
        String output=mirrorCharactersOfString(input,3);
        System.out.println(output);
    }
    public static String mirrorCharactersOfString(String str,int n){
        String answer="";
        String reversA="zyxwvutsrqponmlkjihgfedcba";
        int len=str.length();
        for(int i=0;i<n;i++){
            answer+=str.charAt(i);
        }
        for(int i=n;i<len;i++){
            answer+=reversA.charAt(str.charAt(i)-'a');
        }
        return answer;
    }
}
