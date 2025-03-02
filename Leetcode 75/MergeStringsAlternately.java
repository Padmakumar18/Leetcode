
class MergeStringsAlternately {
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.mergeAlternately("abc", "pqr"));
        System.out.println(obj.mergeAlternately("ab", "pqrs"));
        System.out.println(obj.mergeAlternately("abcd", "pq"));
    }
}

class Solution {
    public String mergeAlternately(String s1, String s2) {
        StringBuilder s = new StringBuilder();
        int i = 0, j = 0;
        while (i < s1.length() && j < s2.length()) 
        {
            s.append(s1.charAt(i++));
            s.append(s2.charAt(j++));
        }
        if (i < s1.length()) 
        {
            s.append(s1.substring(i));
        } 
        else if (j < s2.length()) 
        {
            s.append(s2.substring(j));
        }
        return s.toString();
    }
}