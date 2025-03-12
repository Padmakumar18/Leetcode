import java.util.*;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(Solution.removeDuplicates(arr));
    }
}
class Solution {
    public static int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for(int num : nums) {
            if(list.isEmpty()) {
                list.add(num);
            }
            else if(num!=list.get(list.size()-1)) {
                list.add(num);
            }
        }
        for(int i=0;i<list.size();i++) {
            nums[i] = list.get(i);
        }
        return list.size();
    }
}