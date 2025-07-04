import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatesInPlace {

    public static int[] removeDupes(int[] nums){
        HashSet<Integer> set = new LinkedHashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int index=0;
        for(int num : set){
            nums[index++] = num;
        }
        return Arrays.copyOfRange(nums, 0, set.size());
    }

    public static int[] removeDupe(int[] nums){
        int writeIndex = 1;
        for(int readIndex = 1; readIndex<nums.length; readIndex++){
            if(nums[readIndex]!=nums[readIndex-1]){
                nums[writeIndex] = nums[readIndex];
                writeIndex++;
            }
        }
        return Arrays.copyOfRange(nums, 0, writeIndex);
    }

    public static int[] removeDupInPlace(int[] nums){
        int writeIndex = 1;
        for(int readIndex=1; readIndex<nums.length; readIndex++){
            if(nums[readIndex]!=nums[readIndex-1]){
                nums[writeIndex] = nums[readIndex];
                writeIndex++;
            }
        }
        return Arrays.copyOf(nums, writeIndex);
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,2,3,4,4,5};
        // System.out.println(Arrays.toString(removeDupes(nums)));
        // System.out.println(Arrays.toString(removeDupe(nums)));
        System.out.println(Arrays.toString(removeDupInPlace(nums)));
    }
}