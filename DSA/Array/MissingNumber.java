package DSA.Array;

public class MissingNumber {
    public static int missingNumber(int []nums){
        int cnt = 1;
        for(int num:nums){
            if(num!=cnt){
                return cnt;
            }
            cnt++;
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,7};
        System.out.println(missingNumber(nums));
    }
}
