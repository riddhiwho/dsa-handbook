public class MajorityElement {

    public static int findMajorityElement(int[] nums){
        int temp = nums[0];
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==temp){
                count++;
            }else{
                count--;
                if(count==0){
                    temp=nums[i];
                }
            }
        }

        count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==temp) count++;
        }
        return count>nums.length/2 ? temp : -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(findMajorityElement(nums));
    }
}
