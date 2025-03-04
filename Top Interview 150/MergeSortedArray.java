import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 3, 5, 0, 0, 0};
        int m = 3; 
        int[] nums2 = {2, 4, 6};
        int n = 3;

        solution.merge(nums1, m, nums2, n);

        System.out.println("Merged array: " + Arrays.toString(nums1));
    }
}

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1; 
        int p2 = n - 1; 
        int p = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}
