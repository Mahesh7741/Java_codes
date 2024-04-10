package DSA.String;

public class RearrangedPalidrome {
    public static boolean isStringPalidromAfterRearranged(String str){
        int [] heap=new int[26];
        int oddcnt=0;
        for(char ch:str.toCharArray()){
            heap[ch-'a']++;
        }
        for(int i=0;i<str.length();i++){
            if(heap[i]%2!=0){
                oddcnt++;
            }
            if(oddcnt>1){
                return false;
            }
        }
        return true;
    }
    public static void main(String arg[]){
        String str="aab";
        boolean result=isStringPalidromAfterRearranged(str);
        System.out.println(result);
    }
}
