import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {3, 2, 2, 3, 4, 5};
        int val = 3;

        int newLength = solution.RemoveElement(nums, val);

        System.out.println("New array length: " + newLength);
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
    }
}

class Solution {
    public int RemoveElement(int[] nums, int val) {
        int num = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] != val) {
                nums[num++] = nums[i];
            }
        }
        return num;
    }
}