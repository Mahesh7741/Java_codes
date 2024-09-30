import java.util.*;
//Function Recursion solution
/*
public class  ParameterisedAndFunctionalRecursion{
	public static int sumOfNumber(int n){
		if(n<0){
			return 0;
		}
		return n+sumOfNumber(n-1);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=sumOfNumber(n);
		System.out.println(sum);
		sc.close();
	}
}
*/


//Parameter Recursion solution
/*
public class  ParameterisedAndFunctionalRecursion{
	public static void sumOfNumber(int n,int sum){
		if(n<0){
			System.out.println(sum);
			return;
		}
		sumOfNumber(n-1,sum+n);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sumOfNumber(n,0);
		sc.close();
	}
}
*/

//N number factores (N!)
public class  ParameterisedAndFunctionalRecursion{
	public static int fact(int n){
		if(n==1) return 1;
		return n*fact(n-1);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fact(n));
		sc.close();
	}
}