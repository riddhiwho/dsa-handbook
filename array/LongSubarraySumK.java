import java.util.HashMap;
import java.util.Map;

public class LongSubarraySumK {

    public static int findLongestSub(int[] nums, int k){
        int maxLen = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int prefixSum=0;
        for(int i=0; i<nums.length; i++){
            prefixSum+=nums[i];
            if(map.containsKey(prefixSum - k)){
                maxLen = Math.max(maxLen, i-map.get(prefixSum-k));
            }
            map.putIfAbsent(prefixSum, i);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        // int[] nums = {1,2,3,1,1,1};
        // int k = 3;
        int[] nums = {-1,1,0,1};
        int k = 1;
        System.out.println(findLongestSub(nums, k));
    }
}
