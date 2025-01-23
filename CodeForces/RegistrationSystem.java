import java.util.*;
public class RegistrationSystem{ 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int n = sc.nextInt();
		Map<String, Integer> m = new HashMap<>();
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			if(!m.containsKey(s)) {
				m.put(s, 0);
				System.out.println("OK");
			} else {
				m.put(s, m.get(s) + 1);
				s = s + m.get(s);
				m.put(s, 0);
				System.out.println(s);
			}
		}
	}
}
