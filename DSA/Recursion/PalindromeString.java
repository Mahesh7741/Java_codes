import java.util.*;
//Check string is palindrome or not
public class PalindromeString{
	public static boolean checkPalindrome(String str,int length,int i){
		if(i>=(length/2)){
			return true;
		}
		if(!(str.charAt(i)==str.charAt(length-1-i))){
			return false;
		}
		return checkPalindrome(str,length,i+1);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int length=str.length();
		System.out.println(checkPalindrome(str,length,0));
		sc.close();
	}
}