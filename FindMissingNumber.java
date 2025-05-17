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

    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5};
        System.out.println(findMissing(nums));
    }
}
