package DSA.Bitwise_Algorithms;

public class GetNext {
    public static void main(String arg[]){
        int n=5;
        getNext(n);
    }
    public static void getNext(int n){
        int count=countSetBits(n);
        int totalNumberOfBits=(int)((Math.log(n)/Math.log(2))+1);
        System.out.println(totalNumberOfBits);
        int smallest =0;
        int largest =0;
        for(int i=0; i<count; i++){
            smallest += (int)Math.pow(2, i);
        }
        System.out.println(smallest);
        for (int i = 0; i < count; i++) {
            largest |= (1 << (totalNumberOfBits - i - 1));
        }
        System.out.println(largest);
    }
    public static int countSetBits(int n){
        int count=0;
        while(n!=0){
            count+=n&1;
            n=n>>1;
        }
        return count;
    }
}
