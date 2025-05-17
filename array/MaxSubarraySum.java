public class MaxSubarraySum {

    public static int findMaxSum(int[] nums){
        int maxSum = Integer.MIN_VALUE;
        int sum=0;
        int tempStart=0;
        int start=0;
        int end=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            if(sum>maxSum){
                maxSum=sum;
                start = tempStart;
                end=i;
            }
            if(sum<0) {
                sum=0;
                tempStart=i+1;
            }
        }
        System.out.println(start);
        System.out.println(end);
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, -2, 7, -4};
        System.out.println(findMaxSum(nums));
    }
}
