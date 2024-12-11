import java.util.*;
public class Triple{ 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int T = sc.nextInt();
		while (T-- > 0) {
			long n = sc.nextLong();
			Map<Long, Long> hMap = new HashMap<>();
			for (int i = 0; i < n; i++) {
				long t = sc.nextLong();
				hMap.put(t, hMap.getOrDefault(t, 0L) + 1);
			}
			long ans = -1;
			for (Map.Entry<Long, Long> entry : hMap.entrySet()) {
				if (entry.getValue() >= 3) {
					ans = entry.getKey();
					break;
				}
			}
			System.out.println(ans);
		}
	}
}
