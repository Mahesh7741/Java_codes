import java.util.*;

public class PatrickAndShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long d1 = sc.nextLong();
        long d2 = sc.nextLong();
        long d3 = sc.nextLong();
        long path1 = d1 + d2 + d3;
        long path2 = 2 * (d1 + d2); 
        long path3 = 2 * (d1 + d3);
        long path4 = 2 * (d2 + d3);
        long minDistance = Math.min(Math.min(path1, path2), Math.min(path3, path4));
        System.out.println(minDistance);
        sc.close();
    }
}
