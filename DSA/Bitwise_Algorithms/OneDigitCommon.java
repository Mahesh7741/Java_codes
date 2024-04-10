package DSA.Bitwise_Algorithms;

public class OneDigitCommon {
    public static void main(String arg[]){
        
        int []arr = new int[]{ 10, 12, 24 };
        int n = arr.length;
        System.out.print(countPairs(arr, n));
    }
    public static int countPairs(int[] arr, int n){
        int numberOfPairs = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if (checkValidPair(arr[i], arr[j]))
                    numberOfPairs++;
                }
        }
        return numberOfPairs;
    }
    public static boolean checkValidPair(int n1 , int n2){
        String s1=Integer.toString(n1);
        String s2=Integer.toString(n2);
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }
}
