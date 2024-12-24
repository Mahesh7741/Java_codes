import java.util.*;
public class BeautifulYear{ 
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        long n = sc.nextLong();
        while(true){
            n++;
            long temp = n;
            int a = (int)(temp % 10); temp /= 10;
            int b = (int)(temp % 10); temp /= 10;
            int c = (int)(temp % 10); temp /= 10;
            int d = (int)(temp % 10);
            if (a != b && a != c && a != d && b != c && b != d && c != d) break;
        }
        System.out.println(n);
    }
}
