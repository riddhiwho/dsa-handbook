import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static int findSingleNum(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()==1) return entry.getKey();
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(findSingleNum(nums));
    }
}
