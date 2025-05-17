import java.util.Arrays;

public class LeftRotateKPlaces {

    public static int[] leftRotateK(int[] nums, int k){
        if (nums == null || nums.length == 0) return null;

        k = k % nums.length;

        if(k==0) return nums;

        int[] temp = new int[k];
        for(int x=0; x<k; x++){
            temp[x]=nums[x];
        }

        for(int i=k; i<nums.length; i++){
            nums[i-k] = nums[i];
        }

        int start = nums.length-k;
        for(int j=0; j<k; j++){
            nums[start++] = temp[j];
        }

        return nums;
    }

    public static int[] leftRotateKInPlace(int[] nums, int k){
        if(nums==null || nums.length==0) return null;
        k = k%nums.length;
        if(k==0) return nums;

        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
        reverse(nums, 0, nums.length-1);

        return nums;

    }

    public static void reverse(int[] nums, int start, int end){
        while (start<end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        // System.out.println(Arrays.toString(leftRotateK(nums, 3)));
        System.out.println(Arrays.toString(leftRotateKInPlace(nums, 3)));
    }
}
