import java.util.*;
public class MaximumSubarraySum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int max=Integer.MIN_VALUE;
		int sum=0;
		//Kadane's Algorithm Method
		int start=-1,end=-1;
		for(int i=0;i<size;i++){
			if(sum==0){
				start=i;
			}
			sum=sum+arr[i];
			if(sum >max){
				max=sum;
				end=i;
			}
			if(sum<0){
				sum=0;
			}
			
		}
		System.out.println(max+" "+start+" "+end);
		sc.close();
	}
}