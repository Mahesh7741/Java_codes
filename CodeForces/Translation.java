import java.util.*;
public class Translation{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String t=sc.nextLine();
		sc.close();
		StringBuilder newStr=new StringBuilder(t);
		String check=newStr.reverse().toString();
			if(s.equals(check)){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
			
	}
}