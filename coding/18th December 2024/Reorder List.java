//Reorder List
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
    public void reorderList(ListNode head) 
    {
        ListNode temp1 = head;
        ListNode temp2 = head;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        while(temp1 != null)
        {
            arr.add(temp1.val);
            temp1 = temp1.next;
        }
        for(int i = 0, j = arr.size() - 1; i <= j; i++, j--)
        {
            res.add(arr.get(i));
            res.add(arr.get(j));
        }
        int ind = 0;
        while(temp2 != null)
        {
            temp2.val = res.get(ind);
            ind++;
            temp2 = temp2.next; 
        }
    }
}