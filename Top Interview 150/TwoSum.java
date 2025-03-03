import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = solution.twoSum(nums, target);
        
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers add up to the target.");
        }
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++) {
            int temp = target - nums[i];

            if(map.containsKey(temp)) {
                return new int[] {map.get(temp) , i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}