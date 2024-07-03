package DSA.Array;

public class MaximumConsecutiveOnes {
    public static int maximumConsecutiveOnes(int []nums){
        int cnt=0;
        int mx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cnt++;
                mx=Math.max(mx,cnt);
            }
            else{
                cnt=0;
            }
        }
        return mx;
    }
    public static void main(String[] args) {
        int nums[]={1,1,0,1,1,1};
        System.out.println(maximumConsecutiveOnes(nums));
    }
}
