package DSA.Array;

public class SingleNumberInArray {
    public static int singleNumberInArray(int[] nums){
        int singleNumber=0;
        for(int num:nums){
            singleNumber ^=num;
        }
        return singleNumber;
    }
    public static void main(String[] args) {
        int []nums={1,1,2,2,0};
        System.out.println(singleNumberInArray(nums));
    }
}
