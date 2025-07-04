import java.util.Arrays;

public class MoveZeroes {

    public static int[] removeDupe(int[] nums){
        int writeIndex = 0;
        for(int readIndex = 0; readIndex<nums.length; readIndex++){
            if(nums[readIndex]!=0){
                nums[writeIndex] = nums[readIndex];
                writeIndex++;
            }
        }
        while (writeIndex<nums.length) {
            nums[writeIndex++] = 0;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,0,2,4,6,0,0,8};
        System.out.println(Arrays.toString(removeDupe(nums)));
    }
}
