public class Solution
{
    public int CountPrimeSetBits(int left, int right)
    {
        int count = 0;

        for (int i = left; i <= right; i++)
        {
            int setBits = CountSetBits(i);
            if (IsPrime(setBits))
            {
                count++;
            }
        }

        return count;
    }

    private int CountSetBits(int num)
    {
        int bits = 0;

        while (num > 0)
        {
            bits += (num & 1);
            num >>= 1;
        }

        return bits;
    }

    private bool IsPrime(int n)
    {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++)
        {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}