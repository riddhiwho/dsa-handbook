public class CheckSortedArray {

    public static boolean isSorted(int[] nums){
        for(int i=1; i<nums.length; i++){
            if(nums[i]<nums[i-1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,3,4,5,6,6,7,8};
        // int[] nums = {1,2,3,3,4,5,6,6,7,8,7};
        System.out.println(isSorted(nums));
    }
}