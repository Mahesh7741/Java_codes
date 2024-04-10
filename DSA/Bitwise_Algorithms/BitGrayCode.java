package DSA.Bitwise_Algorithms;

public class BitGrayCode {
    public static void main(String[] args) {
        int n = 2; 
        generateGrayCodes(n);
    }

    public static void generateGrayCodes(int n) {
        for (int i = 0; i < (1 << n); i++) {
            int grayCode = i ^ (i >> 1);
            String binaryString = Integer.toBinaryString(grayCode);
            while (binaryString.length() < n) {
                binaryString = "0" + binaryString;
            }
            System.out.println(binaryString);
        }
    }
}
