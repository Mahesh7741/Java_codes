package DSA.Array;

import java.util.HashMap;
import java.util.Arrays;

public class SumOfTwoNumbers {
    public static int []twosum(int []nums,int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args){
        int nums[]={1,2,3,4,5,6,7,8};
        int target=16;
        System.out.println(Arrays.toString(twosum(nums,target)));
    }
}
    