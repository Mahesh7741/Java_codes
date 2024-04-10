

public class StreamPalidrome {
    public static void main(String args[]){
        String str="abcba";
        printStreamOfStringIsPalindrome(str);
    }
    public static void printStreamOfStringIsPalindrome(String str){
        if(str==null || str.isEmpty()){
            System.out.println("String is empty");
        }
        for(int i=1;i<=str.length();i++){
            System.err.println(str.substring(0, i)+"-->"+(isPalindrome(str.substring(0,i))?"Yes":"No"));
        }
    }
    public static boolean isPalindrome(String str){
        int firstPoint=0;
        int lastPoint=str.length()-1;
        while(firstPoint<lastPoint){
            if(str.charAt(firstPoint) != str.charAt(lastPoint)){
                return false;
            }
            firstPoint++;
            lastPoint--;
        }
        return true;
    }
}
