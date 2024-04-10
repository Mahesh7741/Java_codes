package DSA.Bitwise_Algorithms;

public class ParityBit {
    public static void main(String arg[]){
        int n=1742346774;
        parityBit(n);
    }
    public static void parityBit(int n){
        if(n==0){
            System.out.println("Even Parity");
        }
        else if(n==1){
            System.out.println("Odd Parity");
        }
        int count=0;
        while(n!=0){
            count +=n&1;
            n=n>>1;
        }
        if(count%2==0){
            System.out.println("Even Parity");
        }
        else{
            System.out.println("Odd Parity");
        }
    }
}
