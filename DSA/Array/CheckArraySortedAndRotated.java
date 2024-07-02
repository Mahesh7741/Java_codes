package DSA.Array;

public class CheckArraySortedAndRotated {
    public static boolean checkArraySortedAndRotated(int arr[]){
        int cnt=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[(i+1)%5]){
                cnt++;
            }
        }
        return cnt<=1;
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        System.out.println(checkArraySortedAndRotated(arr));
    }
}
