package DSA.Array;

public class LargestElementInArray {
    public static int largestElementInArray(int arr[],int n){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max-arr[i]<0){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1, 8, 7, 56, 90};
        System.out.println(largestElementInArray(arr,arr.length));
    }
}