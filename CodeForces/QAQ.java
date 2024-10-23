import java.util.*;
public class QAQ{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        long q = 0, qa = 0, qaq = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'Q') {
                q++;
                qaq += qa;
            } else if (s.charAt(i) == 'A') {
                qa += q;
            }
        }
        System.out.println(qaq);
        sc.close();
		
	}
}