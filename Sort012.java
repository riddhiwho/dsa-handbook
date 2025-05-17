import java.util.Arrays;

public class Sort012 {

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static int[] sortArray(int[] nums){
        int l=0;
        int m=0;
        int r=nums.length-1;

        while (m<=r) {
            if(nums[m]==0){
                swap(nums, l, m);
                l++;
                m++;
            }else if(nums[m]==1){
                m++;
            }else{
                swap(nums, m, r);
                r--;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(sortArray(nums)));
    }
}
