

public class BinaryPalindrome{ 
    // public static void main(String []arg){
    //     int decimalNumber=123;
    //     int totalBits=findTotalBits(decimalNumber);
    //     System.out.println(totalBits);
    // }
    //  public static int findTotalBits(int decimalNumber){
    //     if(decimalNumber==0){
    //         return 1;
    //     }
    //     int highestSetOfBits=(int)((Math.log(decimalNumber))/Math.log(2)+1);
    //     return highestSetOfBits;
    // } 

    public static void main(String arg[]){
        int decimalNumber=9;
        boolean isBinaryPalindrome=isBinaryPalindrome(decimalNumber);
        System.out.println(isBinaryPalindrome);
    }
    public static boolean isBinaryPalindrome(int decimalNumber){
        String binaryString=Integer.toBinaryString(decimalNumber);
        int i=0;
        int j=binaryString.length()-1;
        while(i<j){
            if(binaryString.charAt(i)!=binaryString.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
};