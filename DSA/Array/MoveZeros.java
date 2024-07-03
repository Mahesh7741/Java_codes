package DSA.Array;

public class MoveZeros {
    public static void moveZeros(int []nums){
        int cnt=0,n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[cnt]=nums[i];
                cnt++;
            }
        }
        for(int i=cnt;i<n;i++){
            nums[i]=0;
        }
    }
    public static void main(String[] args){
        int nums[]={0,1,0,3,12};
        moveZeros(nums);
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
        
    }
}
