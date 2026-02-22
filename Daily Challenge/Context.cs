public class Solution
{
    public int ScoreDifference(int[] nums)
    {
        bool isFirstPlayerActive = true;
        int firstPlayerScore = 0;
        int secondPlayerScore = 0;

        for (int i = 0; i < nums.Length; i++)
        {
            if (nums[i] % 2 != 0)
            {
                isFirstPlayerActive = !isFirstPlayerActive;
            }
            if ((i + 1) % 6 == 0)
            {
                isFirstPlayerActive = !isFirstPlayerActive;
            }
            if (isFirstPlayerActive)
            {
                firstPlayerScore += nums[i];
            }
            else
            {
                secondPlayerScore += nums[i];
            }
        }

        return firstPlayerScore - secondPlayerScore;
    }
}