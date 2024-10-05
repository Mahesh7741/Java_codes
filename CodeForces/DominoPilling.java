import java.util.*;
public class DominoPilling{
	public static int dominoPailling(int n,int m){
		return (n*m)/2;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int result=dominoPailling(n,m);