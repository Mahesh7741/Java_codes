package DSA.Bitwise_Algorithms;

public class IsSparse {
    public static void main(String[] args){
        int decimalNumber=12;
        boolean isSparse=isSparse(decimalNumber);
        System.out.println(isSparse);
    }
    public static boolean isSparse(int decimalNumber){
        int n=(int)((Math.log(decimalNumber)/Math.log(2))+1);
        String stringbinary=Integer.toBinaryString(decimalNumber);
        int f=0;
        int s=1;
        for(int i=0;i<n;i++){
            if(stringbinary.charAt(f)=='1'&&stringbinary.charAt(s)=='1'&&stringbinary.charAt(f)==stringbinary.charAt(s)){
                return false;
            }
            f++;
            s++;
        }
        return true;
    }
}
