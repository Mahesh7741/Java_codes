import java.util.*;

public class SecondOrderStatistics{
    Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        new SecondOrderStatistics().solve();
    }
    
    void solve(){
        int n = sc.nextInt();
        TreeSet<Integer> s = new TreeSet<>();
        
        for(int i = 0; i < n; ++i){
            int x = sc.nextInt();
            s.add(x);
        }
        
        if(s.size() == 1)
            System.out.println("NO");
        else
            System.out.println(s.higher(s.first()));
    }
}
