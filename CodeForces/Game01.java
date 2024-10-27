import java.util.*;
public class Game01{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t = sc.nextInt();
        sc.nextLine(); 
        
        while (t-- > 0) {
            String s = sc.nextLine();
            int zero = 0, one = 0;
            for (char i : s.toCharArray()) {
                if (i == '0') {
                    zero++;
                } else {
                    one++;
                }
            }
            int ans = Math.min(zero, one);
            if (ans % 2 == 1) {
                System.out.println("DA");
            } else {
                System.out.println("NET");
            }
        }
        
        sc.close();
	}
}