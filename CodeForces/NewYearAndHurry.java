import java.util.*;

public class NewYearAndHurry {
    public static boolean isCheckProblemSolve(int num, int remTime) {
        int sum = 5 * num * (num + 1) / 2;  
        return sum <= remTime;        
    }

    public static int maximumProblemSolve(int n, int k) {
        int remTime = 240 - k;  
        int low = 0, high = n;        
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isCheckProblemSolve(mid, remTime)) {
                low = mid + 1;  
            } else {
                high = mid - 1;  
            }
        }
        return high;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int k = sc.nextInt();  
        int result = maximumProblemSolve(n, k);
        System.out.println(result);  
        sc.close();
    }
}
