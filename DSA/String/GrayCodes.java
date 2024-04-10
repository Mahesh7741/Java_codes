

public class GrayCodes {
    public static void main(String arg[]){
        int n=4;
        grayCode(n);
    }
    public static void grayCode(int n){
        for(int i=0; i<Math.pow(2, n); i++){
            String code=generateBinary(i);
            if(code.length()!=n){
                code=lengthChangeString(code,n);
            }
            System.out.println(code+" ");
        }
    }
    public static String generateBinary(int n){
        StringBuilder sb = new StringBuilder();
        while(n!=0){
            sb.insert(0, n%2);
            n /= 2;
        }
        return sb.toString();
    }
    public static String lengthChangeString(String str,int n) {
        int length=n-str.length();
        StringBuilder sb = new StringBuilder(str);
        for(int i=0; i<length; i++){
            sb.insert(0, 0);
        }
        return sb.toString();
    }
}
