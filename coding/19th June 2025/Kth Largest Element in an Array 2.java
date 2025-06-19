//Kth Largest Element in an Array
class Solution 
{
    public int findKthLargest(int[] nums, int k) 
    {
        PriorityQueue<Integer> que = new PriorityQueue<>();
        for(int ele : nums)
        {
            que.add(ele);
            if(que.size() > k)
                que.poll();
        }
        return que.peek();
    }
}
