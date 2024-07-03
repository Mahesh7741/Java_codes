package DSA.Array;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length - 1;
        int cnt = 0;
        for(int i=k;i>=0;i--){
            int temp=nums[i];
            nums[i]=nums[n-cnt];
            nums[n-cnt]=temp;
            cnt++;
        }
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        int k=3;
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        rotate(nums,k);
        System.out.println();
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}