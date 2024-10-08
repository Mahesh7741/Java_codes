import java.util.*;
public class Borze{
	public static String decodeBorze(String s){
		StringBuilder newStr=new StringBuilder();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='.'){
				newStr.append("0");
			}else if(s.charAt(i)=='-' && s.charAt(i+1)=='.'){
				newStr.append("1");
				i++;
			}else{
				newStr.append("2");
				i++;
			}
		}
		return newStr.toString();
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String decode=decodeBorze(s);
		System.out.println(decode);
		sc.close();
	}
}