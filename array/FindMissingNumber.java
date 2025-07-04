public class FindMissingNumber {

    public static int findMissing(int[] nums){
        int[] hash = new int[nums.length+1];
        for(int i=0; i<nums.length; i++){
            hash[nums[i]] = 1;
        }
        for(int i=0; i<hash.length; i++){
            if(hash[i]!=1) return i;
        }
        return nums.length;
    }

    public static int findMissingOptimal(int[] nums){
        int sum=0;
        int count=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            count++;
        }
        int estimatedSum = count*(count+1)/2;
        return estimatedSum-sum;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5};
        // System.out.println(findMissing(nums));
        System.out.println(findMissingOptimal(nums));
    }
}
