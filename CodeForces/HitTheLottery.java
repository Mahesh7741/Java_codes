import java.util.*;
public class HitTheLottery{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        long n=sc.nextLong();
        long total=0;
        while(n > 0){
            if(n >= 100){
                total += n / 100;
                n %= 100;
            } else if(n >= 20){
                total += n / 20;
                n %= 20;
            } else if(n >= 10){
                total += n / 10;
                n %= 10;
            } else if(n >= 5){
                total += n / 5;
                n %= 5;
            } else {
                total += n / 1;
                n %= 1;
            }
        }
        System.out.println(total);
    }
}
