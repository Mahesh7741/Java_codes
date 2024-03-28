package DSA.Bitwise_Algorithms;

public class GraytoBinary {
    public static void main(String arg[]) {
        String s = "0010";
        String binary = grayToBinary(s);
        System.out.println(binary);
    }

    public static String grayToBinary(String grayCode) {
        String binaryCode = "";
        binaryCode += grayCode.charAt(0);
        for (int i = 1; i < grayCode.length(); i++) {
            if (grayCode.charAt(i) == '0' && binaryCode.charAt(i - 1) == '0'
                    || grayCode.charAt(i) == '1' && binaryCode.charAt(i - 1) == '1') {
                binaryCode += "0";
            } else {
                binaryCode += "1";
            }
        }
        return binaryCode;
    }
}
