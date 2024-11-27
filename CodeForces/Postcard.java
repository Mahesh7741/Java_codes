import java.util.*;
public class Postcard{ 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		while(sc.hasNext()) {
			String s = sc.next();
			int n = sc.nextInt();
			int cnt = 0, cntt = 0;
			StringBuilder s2 = new StringBuilder();
			StringBuilder s3 = new StringBuilder();
			StringBuilder s4 = new StringBuilder();
			List<Character> v = new ArrayList<>();
			
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == '?' || s.charAt(i) == '*') cnt++;
				if(s.charAt(i) == '*') cntt++;
				if(s.charAt(i) != '?' && s.charAt(i) != '*') s2.append(s.charAt(i));
			}
			
			int l = s.length() - cnt;
			int removeAble = l - cnt;

			if(cnt == 0) {
				if(n != s.length()) System.out.println("Impossible");
				else System.out.println(s2);
			} else if(cntt == 0 && l < n) {
				System.out.println("Impossible");
			} else if(cnt != 0 && l == n) {
				System.out.println(s2);
			} else if(cnt != 0 && removeAble > n) {
				System.out.println("Impossible");
			} else if(cnt != 0 && l > n) {
				int z = l - n;
				for(int i = 0; i < s.length(); i++) {
					if(s.charAt(i) == '?' || s.charAt(i) == '*') {
						z--;
						s = s.substring(0, i - 1) + s.substring(i);
						i--;
					}
					if(z == 0) break;
				}
				for(int i = 0; i < s.length(); i++) {
					if(s.charAt(i) != '?' && s.charAt(i) != '*') s3.append(s.charAt(i));
				}
				System.out.println(s3);
			} else if(cnt != 0 && n > l) {
				int x = n - l;
				int y = -1;
				for(int i = 1; i < s.length(); i++) {
					if(s.charAt(i) == '*') {
						while(x-- > 0) v.add(s.charAt(i - 1));
						y = i - 1;
						break;
					}
				}
				for(char ch : v) s3.append(ch);
				s = s.substring(0, y) + s3 + s.substring(y);
				for(int i = 0; i < s.length(); i++) {
					if(s.charAt(i) != '?' && s.charAt(i) != '*') s4.append(s.charAt(i));
				}
				System.out.println(s4);
			}
		}
	}
}
