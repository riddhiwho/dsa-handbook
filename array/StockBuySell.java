public class StockBuySell {

    public static int findMaxProfit(int[] nums){
        int profit=0;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            min = Math.min(min, nums[i]);
            profit=Math.max(profit, (nums[i]-min));
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(findMaxProfit(prices));
    }
}
