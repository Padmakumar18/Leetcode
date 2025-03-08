public class MinimumRecolors
{
    public static void main(String[] args)
    {
        System.out.println(Solution.minimumRecolors("WBBWWBBWBW",7));
    }
}

class Solution {
    public static int minimumRecolors(String str, int k) {
        int w = 0;
        String string = "";
        for(int i=0;i<k;i++) {
            string = string + "B";
        }
        for(int i=0;i<str.length()-k;i++) {
            if(string.equals(str.substring(i,i+k))) {
                return 0;
            }
        }

        for(int i=0;i<k;i++) {
            if(str.charAt(i) == 'W') {
                w++;
            }
        }
        int min =w;
        for (int i = 1; i <= str.length() - k; i++) {
            if (str.charAt(i-1) == 'W') {
                w--;
            }
            if (str.charAt(i + (k - 1)) == 'W') {
                w++;
            }
            if(w < min) {
                min = w;
            }
        }
        return min;
    }
}