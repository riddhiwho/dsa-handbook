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
        
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]>first){
        //         System.out.println(nums[i] + " greater than first: " + first);
        //         // swap(nums, first, second);
        //         second = first;
        //         first = nums[i];
        //         System.out.println("updated first: " + first);
        //     }else if(nums[i]>second && nums[i]!=first){
        //         System.out.println(nums[i] + " greater than second: " + second);
        //         second = nums[i];
        //         System.out.println("updated second: " + second);
        //     }
        // }
        // return second;
    }

    public static int findSecondLargest(int[] nums){
        int first = 0;
        int second = 1;

        for(int i=2; i<nums.length; i++){
            if(nums[i]>nums[first]){
                System.out.println(nums[i] + " greater than first: " + nums[first]);
                swap(nums, first, second);
                first = i;
                System.out.println("updated first: " + nums[first]);
            }else if(nums[i]>nums[second] && nums[i]!=nums[first]){
                System.out.println(nums[i] + " greater than second: " + nums[second]);
                second = i;
                System.out.println("updated second: " + nums[second]);
            }
        }
        return nums[second];
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
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