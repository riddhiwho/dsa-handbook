public class MaximumProductSubarray {

    public static int maxProd(int[] nums){
        int prefixProduct = 1;
        int suffixProduct = 1;
        int maxProduct = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            prefixProduct*=nums[i];
            suffixProduct*=nums[nums.length-i-1];
            maxProduct= Math.max(maxProduct, Math.max(prefixProduct, suffixProduct));
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println(maxProd(nums));
    }
}
