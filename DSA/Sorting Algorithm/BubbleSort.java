import java.util.*;
public class BubbleSort{
	public static void bubbleSort(int[] arr,int n){
		
	}
	public static void print(int[] arr,int size){
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		bubbleSort(arr,size);
		print(arr,size);
		sc.close();
	}
}