public class Solution
{
    public int[] SortByBits(int[] arr)
    {
        Array.Sort(arr, (a, b) =>
        {
            int bitCountA = BitOperations.PopCount((uint)a);
            int bitCountB = BitOperations.PopCount((uint)b);

            if (bitCountA == bitCountB)
                return a.CompareTo(b);

            return bitCountA.CompareTo(bitCountB);
        });

        return arr;
    }
}