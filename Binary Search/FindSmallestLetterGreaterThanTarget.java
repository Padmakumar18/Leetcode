public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] charArray = new char[]{'c','f','j'};
        char target = 'a';

        Solution obj = new Solution();

        System.out.println(obj.nextGreatestLetter(charArray, target));
    }
}

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(letters[mid] > target) {
                end = mid-1 ;
            }
            else {
                start = mid +1;
            }
        }
        return letters[start % letters.length];
    }
}