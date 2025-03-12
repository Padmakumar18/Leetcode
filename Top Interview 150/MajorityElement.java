public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = new int[]{2,2,1,1,1,2,2};
        Solution obj = new Solution();
        System.out.println(obj.majorityElement(arr));
    }
}

class Solution {
    public int majorityElement(int[] nums) {
        int temp = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                temp = num;
            }
            count += (num == temp) ? 1 : -1;
        }

        return temp;
    }
}