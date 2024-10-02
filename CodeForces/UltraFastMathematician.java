import java.util.*;
public class UltraFastMathematician{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		StringBuilder s=new StringBuilder();
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i)=='0'&&str2.charAt(i)=='0'||str1.charAt(i)=='1'&&str2.charAt(i)=='1'){
				s.append('0');
			}
			else{
				s.append('1');
			}
		}
		System.out.println(s.toString());
		sc.close();
	}
}