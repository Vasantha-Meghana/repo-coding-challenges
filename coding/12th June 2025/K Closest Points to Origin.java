//K Closest Points to Origin
class Solution 
{
    public int[][] kClosest(int[][] points, int k) 
    {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> (b[0]* b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1]));
        int[][] res = new int[k][2];
        for(int[] ele : points)
        {
            maxHeap.add(ele);
            if(maxHeap.size() > k)
                maxHeap.poll(); 
        }
        int i = 0;
        while(maxHeap.isEmpty() != true)
            res[i++] = maxHeap.poll();
        return res;
    }
}
