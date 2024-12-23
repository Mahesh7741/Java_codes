import java.util.*;
public class MakeAllEqual{ 
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        long t = sc.nextLong();
        while(t-- >0){
            long n = sc.nextLong();
            long[] arr = new long[(int) n];
            HashMap<Long, Long> hMap = new HashMap<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                hMap.put(arr[i], hMap.getOrDefault(arr[i], 0L) + 1);
            }

            long maxFreq = 0;
            for (Map.Entry<Long, Long> entry : hMap.entrySet()) {
                maxFreq = Math.max(maxFreq, entry.getValue());
            }

            System.out.println(n - maxFreq);
        }
    }
}
