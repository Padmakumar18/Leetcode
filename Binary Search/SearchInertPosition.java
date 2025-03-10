public class SearchInertPosition {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,6};
        int target = 5;

        Solution obj = new Solution();
        System.out.println(obj.searchInsert(arr, target));
    }
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid; 
            } else if (nums[mid] < target) {
                left = mid + 1;
                
            } else {
                right = mid - 1; 
            }
        }
        
        return left;
    }
}
