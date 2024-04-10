package DSA.String;

public class RemoveAllOccurrences {
    public static void main(String[] args){
        String str="Mahesh";
        char c='h';
        String newString=removeAllOccurrences(str,c);
        System.out.println(newString);
    }
    public static String removeAllOccurrences(String str,char c) {
        String newString="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c){
                continue;
            }
            newString+=str.charAt(i);
        }
        return newString;
    }
}
