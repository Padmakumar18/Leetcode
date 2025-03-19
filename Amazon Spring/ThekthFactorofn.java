import java.util.*;
public class ThekthFactorofn {
    public static void main(String[] args) {
        System.out.println(Solution.kthFactor(12,3));
    }
}


class Solution {
    public static int kthFactor(int n, int k) {
        int i = 1;
        List<Integer> list = new ArrayList<>();
        while(i <= n) {
            if(n % i == 0) {
                list.add(i);
            }
            i++;
        }
        if(k > list.size()) {
            return -1;
        }
        return list.get(k-1);
    }
}