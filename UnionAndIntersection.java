import java.util.Arrays;

public class UnionAndIntersection {

    public static int[] findUnion(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                if (k == 0 || nums1[i] != result[k - 1]) {
                    result[k++] = nums1[i];
                }

                i++;
            } else if (nums2[j] < nums1[i]) {
                if (k == 0 || nums2[j] != result[k - 1]) {
                    result[k++] = nums2[j];
                }

                j++;
            }
        }

        for (; i < nums1.length; ++i) {
            if (k == 0 || nums1[i] != result[k - 1]) {
                result[k++] = nums1[i];
            }
        }

        for (; j < nums2.length; ++j) {
            if (k == 0 || nums2[j] != result[k - 1]) {
                result[k++] = nums2[j];
            }
        }

        return Arrays.copyOf(result, k);
    }

    public static int[] findIntersection(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            }

            else if (nums2[j] < nums1[i]) {
                j++;
            }

            else if (nums1[i] == nums2[j]) {
                result[k++] = nums1[i];
                i++;
                j++;
            }
        }

        return Arrays.copyOf(result, k);
    }

    public static void main(String[] var0) {
        int[] var1 = new int[] { 1, 1, 2, 3, 4, 6 };
        int[] var2 = new int[] { 2, 3, 4, 4, 5 };
        System.out.println(Arrays.toString(findUnion(var1, var2)));

        int[] nums1 = { 1, 2, 2, 3, 3, 4, 5, 6 };
        int[] nums2 = { 2, 3, 3, 5, 6, 6, 7 };
        System.out.println(Arrays.toString(findIntersection(nums1, nums2)));
    }
}
