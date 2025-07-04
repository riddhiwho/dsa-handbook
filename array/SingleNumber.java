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

    public static int findSingleNumHash(int[] nums){
        int maxElement = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>maxElement) maxElement = nums[i];
        }

        int[] temp = new int[maxElement+1];

        for(int i=0; i<nums.length; i++){
            temp[nums[i]]+=1;
        }

        for(int i=0; i<temp.length; i++){
            if(temp[i]==1) return i;
        }

        return -1;
    }

    public static int findSingleNumXOR(int[] nums){
        int xor=0;
        for(int i=0; i<nums.length; i++){
            xor=xor^nums[i];
        }
        return xor;
    }


    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(findSingleNum(nums));
        System.out.println(findSingleNumHash(nums));
        System.out.println(findSingleNumXOR(nums));
    }
}
