package DSA.Bitwise_Algorithms;

public class BinaryToGray {
    public static void main(String arg[]){
        String binaryCode="100110";
        String graycode=binaryToGraycode(binaryCode);
        System.out.println(graycode);
    }
    public static String binaryToGraycode(String binaryCode) {
        String graycode="";
        graycode +=binaryCode.charAt(0);
        for(int i=1; i<binaryCode.length(); i++){
            if(binaryCode.charAt(i-1)=='0'&& binaryCode.charAt(i)=='0'||
                binaryCode.charAt(i-1)=='1'&& binaryCode.charAt(i)=='1'){
                    graycode +='0';
                }
            else{
                graycode += "1";
            }
        }
        return graycode;
    }
}
