package DSA.Bitwise_Algorithms;


public class CopySetInGivenRange {
    public static void main(String  arg[]){
        int x=10;
        int y=13;
        int l=2;
        int r=3;
        int result=copySetBit(x, y, l, r);
        System.out.println(result);
    }
    public static int copySetBit(int x, int y, int l, int r){
        if(l<1||r>32){
            return x;
        }
        for(int i=l; i<=r; i++){
            int mask=1<<(i-1);
            if((y&mask)!=0){
                x=x|mask;
            }
        }
        return x;
    }
}
