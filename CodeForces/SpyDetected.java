import java.util.*;
public class SpyDetected{ 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int T = sc.nextInt();
		while (T-- > 0) {
			long n = sc.nextLong();
			long[] arr = new long[(int)n];
			Map<Long, Long> hMap = new HashMap<>();

			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextLong();
				hMap.put(arr[i], hMap.getOrDefault(arr[i], 0L) + 1);
			}

			long elementToFind = -1;
			for (Map.Entry<Long, Long> entry : hMap.entrySet()) {
				if (entry.getValue() == 1) {
					elementToFind = entry.getKey();
					break;
				}
			}

			int index = -1;
			for (int i = 0; i < n; i++) {
				if (arr[i] == elementToFind) {
					index = i + 1;
					break;
				}
			}

			System.out.println(index);
		}
	}
}
