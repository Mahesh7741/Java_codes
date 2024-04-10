package DSA.String;

public class IterationsOfBinary {
    public static void main(String arg[]){
        int m=5;
        int n=2;
        int i=4;
        String newString=iteratioString(m,n);
        System.out.println(newString.charAt(i));
    }
    public static String iteratioString(int m, int n){
        String binaryString=generateBinary(m);
        for(int i=0;i<n; i++)
        {
            binaryString=convertString(binaryString);
        }
        return binaryString;
    }
    public static String generateBinary(int m){
        StringBuilder sb= new StringBuilder();
        while(m!=0){
            sb.insert(0, m%2);
            m=m/2;
        }
        return sb.toString();
    }
    public static String convertString(String str){
        String newStr="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                newStr+="10";
            }
            newStr +="01";
        }
        return newStr;
    }
}
