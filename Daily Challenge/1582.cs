public class Solution
{
    public int NumSpecial(int[][] mat)
    {
        int m = mat.Length;
        int n = mat[0].Length;

        int[] rowCount = new int[m];
        int[] colCount = new int[n];

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (mat[i][j] == 1)
                {
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }

        int specialCount = 0;
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (mat[i][j] == 1 && rowCount[i] == 1 && colCount[j] == 1)
                {
                    specialCount++;
                }
            }
        }

        return specialCount;
    }
}