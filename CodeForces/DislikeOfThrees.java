import java.util.*;
public class DislikeOfThrees{ 
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int T = sc.nextInt();
        while (T-- > 0) {
            List<Long> v = new ArrayList<>();
            long k = sc.nextLong();
            for (int i = 1; i <= 2000; i++) {
                if (i % 3 != 0 && i % 10 != 3) {
                    v.add((long) i);
                }
            }
            System.out.println(v.get((int)(k - 1)));
        }
    }
}
