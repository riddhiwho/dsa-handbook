public class MaxConsecutive1s {

    public static int findMax1s(int[] nums){
        int maxCount = 0;
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                count++;
                maxCount = Math.max(maxCount, count);
            }else if(nums[i]==0) count=0;
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0};
        System.out.println(findMax1s(nums));
    }
}
