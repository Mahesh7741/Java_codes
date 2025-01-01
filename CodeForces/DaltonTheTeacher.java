import java.util.*;
public class DaltonTheTeacher{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  
        
        while(t-- > 0) {
            long n = sc.nextLong();
            int x = 0;

            for(int i = 1; i <= n; i++) {
                long a = sc.nextLong();
                if(i == a) {
                    x++;
                }
            }

            if(x % 2 == 0) {
                System.out.println(x / 2);
            } else {
                System.out.println((x / 2) + 1);
            }
        }
        sc.close();
    }
}
