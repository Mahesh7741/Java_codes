package DSA.Bitwise_Algorithms;

public class Euclids_Algorithm {
    public static void main(String arg[]){
        int a=10;
        int b=5;
        int result=gcd(a,b);
        System.out.println(result);
    }
    public  static int gcd(int a,int b){
        if(a==b){
            return a;
        }
        return (a>b)?gcd(a-b, b):gcd(a,b-a);
    }
}
