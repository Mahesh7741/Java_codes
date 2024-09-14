import java.util.Scanner;
public class  Three_Brothers{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		
		int lateBrother=6-(a+b);
		
		System.out.println(lateBrother);
		sc.close();
	}
}