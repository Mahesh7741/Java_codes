package DSA.Bitwise_Algorithms;
public class SquareWithoutUsingOpert{
    public static void main(String[] args){
        int num=7;
        System.out.println(square(num));
    }
    public static int square(int a){
        if(a==0||a==1) {
            return a;
        }
        int x=a>>1;
        int result=square(x);
        if(a%2==0){
            return result<<2;
        }
        else{
            return ((result<<2)+(x<<2)+1);
        }
    }
}