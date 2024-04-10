package DSA.String;

import java.util.ArrayList;

public class GenerateAllBits {
    public static void main(String arg[]){
        int num=4;
        generateAllBitsWithoutConsecutiveOnes(num);
    }
    
    public static void generateAllBitsWithoutConsecutiveOnes(int num){
        int n=(int)(Math.pow(2, num));
        ArrayList<String> bits=new ArrayList<String>();
        for(int i=0; i<n; i++){
            bits.add(generateBits(i, num));
        }
        for(int i=0; i<bits.size(); i++){
            String generatedBit = checkGeneratedBits(bits.get(i));
            if(generatedBit != null) {
                System.out.println(generatedBit);
            }
        }
    }
    
    public static String generateBits(int n, int k){
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<k; i++){
            if(n==0){
                sb.insert(0, 0);
            }
            sb.insert(0, n%2);
            n = n / 2;
        }
        return sb.toString();
    }
    
    public static String checkGeneratedBits(String s){
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1) && s.charAt(i) == '1'){
                return null;
            }
        }
        return s;
    }
}
