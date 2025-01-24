import java.util.*;

public class CodecraftIII{
    Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args){
        new CodecraftIII().solve();
    }
    
    void solve(){
        List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        
        String s = sc.next();
        int n = sc.nextInt();
        
        int index = (n + months.indexOf(s)) % 12;
        
        System.out.println(months.get(index));
    }
}
