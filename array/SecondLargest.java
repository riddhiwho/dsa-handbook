import java.util.Arrays;

public class SecondLargest {

    public static int findSecondLargestUtil(int[] nums){

        if(nums==null || nums.length<2) return -1;

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num : nums){
            if(num>first){
                second=first;
                first=num;
            }else if(num>second && num!=first){
                second=num;
            }
        }

        if(second==Integer.MIN_VALUE){
            System.out.println("No second largest value");
            return -1;
        }

        return second;
    }

    public static int findSecondLargestUsingSort(int[] nums){
        Arrays.sort(nums);
        int largest = nums[nums.length-1];
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i]!=largest){
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,4};
        // int[] nums = {1,2,4,5,7,7};
        System.out.println(findSecondLargestUtil(nums));
        // System.out.println(findSecondLargest(nums));
        // System.out.println(findSecondLargestUsingSort(nums));
    }
}

/***
 * TODO:
 * pass by value, pass by reference in java
 */