public class GreatestCommonDivisorofStrings {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        String[][] testCases = {
            {"ABCABC", "ABC"},  
            {"ABABAB", "ABAB"},  
            {"LEET", "CODE"},  
            {"AAAA", "AA"},
            {"XYZXYZ", "XYZXYZXYZ"}
        };
        
        for (String[] testCase : testCases) {
            System.out.println("GCD of \"" + testCase[0] + "\" and \"" + testCase[1] + "\" is: " + 
                solution.gcdOfStrings(testCase[0], testCase[1]));
        }
    }
}

class Solution 
{
    public String gcdOfStrings(String str1, String str2) 
    {
        if (!(str1 + str2).equals(str2 + str1)) 
        {
            return "";
        }
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

     private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}