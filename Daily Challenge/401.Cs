using System;
using System.Collections.Generic;

public class Solution
{
    public IList<string> ReadBinaryWatch(int turnedOn)
    {
        List<string> result = new List<string>();

        for (int hour = 0; hour < 12; hour++)
        {
            for (int minute = 0; minute < 60; minute++)
            {
                int bits =
                    CountBits(hour) + CountBits(minute);

                if (bits == turnedOn)
                {
                    result.Add($"{hour}:{minute:D2}");
                }
            }
        }

        return result;
    }

    private int CountBits(int n)
    {
        int count = 0;
        while (n > 0)
        {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}
