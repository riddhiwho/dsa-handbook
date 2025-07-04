import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {

    public static List<List<Integer>> mergeIntervals(int[][] nums){
       List<List<Integer>> res = new ArrayList<>();
       for(int i=1; i<nums.length; i++){
        int[] prev = nums[i-1];
        int[] curr = nums[i];
        
        if(prev[1]>=curr[0]){
            int tempMax = Math.max(prev[1], curr[1]);
            res.add(List.of(prev[0], tempMax));
        }
       }
       return res;
    }

    public static void main(String[] args) {
        int[][] nums = {{1,3},{2,6},{8,10},{15,18}};
        List<List<Integer>> res = mergeIntervals(nums);
        System.out.println(res);
    }
}
