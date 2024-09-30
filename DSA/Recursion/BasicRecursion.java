import java.util.*;

//Print Name n times
/*
public class BasicRecursion{
	public static void printName(int i,int n){
		if(i>n){
			return;
		}
		System.out.println("Mahesh : "+i);
		printName(i+1,n);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printName(1,n);
		sc.close();
	}
}
*/
//Print (1 to N)
/*
public class BasicRecursion{
	public static void printNumber(int i,int n){
		if(i>n){
			return;
		}
		System.out.println(i);
		printNumber(i+1,n);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printNumber(1,n);
	}
}
*/

//Print (N to 1)
/*
public class BasicRecursion{
	public static void printReverseNumber(int i){
		if(i<=0){
			return;
		}
		System.out.println(i);
		printReverseNumber(i-1);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printReverseNumber(n);
		sc.close();
	}
}
*/

//Backtracking

//Print Number (1 to N)
/*
public class BasicRecursion{
	public static void printNumberUsingBacktracking(int n){
		if(n<1){
			return;
		}
		printNumberUsingBacktracking(n-1);
		System.out.println(n);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printNumberUsingBacktracking(n);
		sc.close();
	}
}
*/

//Print Number (N to 1)

public class BasicRecursion{
	public static void printReverseNumberUsingBacktracking(int i,int n){
		if(i>n){
			return;
		}
		printReverseNumberUsingBacktracking(i+1,n);
		System.out.println(i);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printReverseNumberUsingBacktracking(1,n);
	}
}
