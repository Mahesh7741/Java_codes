package DSA.Array;
import java.util.*;


public class MajorityElement {
    public static int majorityElement(int []nums){
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int majorityElement = 0;
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                majorityElement = entry.getKey();
            }
        }
        return majorityElement;
    }
    public static void main(String[] args) {
        int nums[]={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
