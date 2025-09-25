//Remove Nth Node From End of List
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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        int count = 0;
        ListNode temp1 = head, temp2 = head;
        while(temp1 != null)
        {
            count++;
            temp1 = temp1.next;
        }
        if(count == n)   return head.next;
        for(int i = 0; i < count - n - 1; i++)
            temp2 = temp2.next;
        temp2.next = temp2.next.next;
        return head;
    }
}
