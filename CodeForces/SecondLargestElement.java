import java.util.*;
public class SecondLargestElement{
	public static int secondLargeElement(int[] arr){
		int largest=-1,secondLargest=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i] >largest){
				secondLargest=largest;
				largest=arr[i];
			}
			else if(arr[i]<largest && arr[i] >secondLargest){
				secondLargest=arr[i];
			}
		}
		return secondLargest;
	}
	public static void main(String[] args){
		int[] arr={1,2,5,6,4,3};
		int result=secondLargeElement(arr);
		System.out.println(result);
	}
}