public class MinCharAddConvertToPali {
    public static void main(String arg[]){
        String str="ABC";
        int result= minCharAddConvertToPali(str);
        System.out.println(result);
    }
    public static int minCharAddConvertToPali(String str){
        int n=str.length();
        for(int i=str.length();i>=0;i--){
            if(isPalindrome(str.substring(0,i))){
                return n-i;
            }
        }
        return n;
    }
    public static boolean isPalindrome(String str){
        int start=0;
        int end=str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
        }
        return true;
    }
}
