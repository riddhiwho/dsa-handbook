import java.util.Arrays;

public class MergeSortedArray {

    public static int[] mergeArray(int[] nums1, int[] nums2, int m, int n){
        int size = m+n-1;
        int i=m-1;
        int j=n-1;

        while (size>=0) {
            if(i>=0 && j>=0){
                if(nums1[i]>nums2[j]){
                    nums1[size--] = nums1[i--];
                }else{
                    nums1[size--] = nums2[j--];
                }
            }else if(i>=0){
                nums1[size--] = nums1[i--];
            }else{
                nums1[size--] = nums2[j--];
            }
        }
        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2  = {2,5,6};
        int n = 3;
        int[] nums = mergeArray(nums1, nums2, m, n);
        System.out.println(Arrays.toString(nums));
    }
}
