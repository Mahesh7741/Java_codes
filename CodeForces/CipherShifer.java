	import java.util.*;
	public class CipherShifer{ 
		static Scanner sc=new Scanner(System.in);
		public static void main(String[] args){
			int T = sc.nextInt();
			while (T-- > 0) {
				int n = sc.nextInt();
				String s = sc.next();
				StringBuilder ans = new StringBuilder();
				int i = 0;
				while (i < n) {
					char currChar = s.charAt(i);
					ans.append(currChar);
					int j = i + 1;
					while (j < n && s.charAt(j) != currChar) {
						j++;
					}
					i = j + 1;
				}
				System.out.println(ans.toString());
			}
		}
	}
