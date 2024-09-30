import java.util.*;
public class ReverseArray{
	public static void reverseArray(int[] arr,int left,int right){
		if(left==right){
			return;
		}
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
		reverseArray(arr,left+1,right-1);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		reverseArray(arr,0,size-1);
		for(int i:arr){
			System.out.print(i+" ");
		}
		sc.close();
	}
}