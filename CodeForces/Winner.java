import java.util.*;
public class Winner{ 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int n = sc.nextInt();
		Map<String, Integer> m = new HashMap<>();
		Map<String, Integer> m2 = new HashMap<>();
		List<Pair> v = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			int x = sc.nextInt();
			m.put(s, m.getOrDefault(s, 0) + x);
			v.add(new Pair(s, x));
		}
		int mx = 0;
		for(Map.Entry<String, Integer> entry : m.entrySet()) {
			mx = Math.max(mx, entry.getValue());
		}
		for(Pair x : v) {
			m2.put(x.first, m2.getOrDefault(x.first, 0) + x.second);
			if(m2.get(x.first) >= mx && m.get(x.first) == mx) {
				System.out.println(x.first);
				return;
			}
		}
	}
}
class Pair {
	String first;
	int second;
	Pair(String first, int second) {
		this.first = first;
		this.second = second;
	}
}
