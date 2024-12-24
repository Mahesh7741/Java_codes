import java.util.*;
public class IdealPoint{ 
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        long T = sc.nextLong();
        while(T-- >0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            HashSet<Long> start = new HashSet<>();
            HashSet<Long> end = new HashSet<>();
            for (int i = 0; i < n; i++) {
                long t1 = sc.nextLong();
                long t2 = sc.nextLong();
                start.add(t1);
                end.add(t2);
            }

            boolean hasStart = start.contains(k);
            boolean hasEnd = end.contains(k);

            if (hasStart && hasEnd) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
