//Find the Minimum and Maximum Number of Nodes Between Critical Points
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution 
{
    public int[] nodesBetweenCriticalPoints(ListNode head) 
    {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        ListNode prev = head;
        while(head.next.next != null)
        {
            prev = head;
            head = head.next;
            i++;
            if(head.val > prev.val && head.val > head.next.val)
                arr.add(i + 1);
            else if(head.val < prev.val && head.val < head.next.val)
                arr.add(i + 1);
        }
        if(arr.size() < 2)
            return new int[]{-1, -1};
        int[] result = new int[2];
        int min = Integer.MAX_VALUE;
        for(int i1 = 1; i1 < arr.size(); i1++)
            min = Math.min(min, arr.get(i1) - arr.get(i1 - 1));
        result[0] = min;
        result[1] = arr.get(arr.size() - 1) - arr.get(0);
        return result;
    }
}
