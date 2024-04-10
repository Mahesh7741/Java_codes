package DSA.String;

public class PrintSubstring{
    public static void main(String arg[]){
        String str="abcd";
        printSubstring(str);
    }
    public static void printSubstring(String str){
        String newStr="";
        for(int i=0; i<str.length(); i++){
            newStr="";
            for(int j=i; j<str.length(); j++){
                newStr+=str.charAt(j);
                System.out.println(newStr);
            }
        }
    }
}