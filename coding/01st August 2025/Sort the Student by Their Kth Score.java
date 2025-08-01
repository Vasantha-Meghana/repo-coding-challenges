// Sort the Student by Their Kth Score
class Solution 
{
    public int[][] sortTheStudents(int[][] score, int k) 
    {
        Arrays.sort(score, (a, b) -> b[k] - a[k]);
        return score;
    }
}
