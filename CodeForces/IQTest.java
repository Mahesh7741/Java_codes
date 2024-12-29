import java.util.*;
public class IQTest{ 
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int n = sc.nextInt();
        Map<Integer, Integer> even = new HashMap<>();
        Map<Integer, Integer> odd = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int elem = sc.nextInt();
            if (elem % 2 == 0) {
                even.put(i, elem);
            } else {
                odd.put(i, elem);
            }
        }
        if (even.size() == 1) {
            for (int key : even.keySet()) {
                System.out.println(key);
            }
        } else if (odd.size() == 1) {
            for (int key : odd.keySet()) {
                System.out.println(key);
            }
        }
    }
}
