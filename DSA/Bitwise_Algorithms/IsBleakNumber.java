package DSA.Bitwise_Algorithms;

public class IsBleakNumber {
    public static void main(String srg[]){
        int x=3;
        boolean result=isBleak(x);
        System.out.println(result);
    }
    public static int setCountBit(int n){
        int count=0;
        while(n!=0){
            count +=n&1;
            n=n>>1;
        }
        return count;
    }
    public static boolean isBleak(int x){
        for(int i=1;i<x;i++){
            if(i+setCountBit(i)==x){
                return false;
            }
        }
        return true;
    }
}
