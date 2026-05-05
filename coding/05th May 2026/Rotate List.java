//Rotate List
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
    public ListNode rotateRight(ListNode head, int k) 
    {
        if(head == null)
            return null;
        ListNode temp = head;
        int len = 1;
        while(temp.next != null)
        {
            len++;
            temp = temp.next;
        }
        if(k % len==0)
            return head;
        if(k > len)
            k = k % len;
        temp.next = head;
        temp = head;
        for(int i = 1; i < (len-k); i++)
            temp = temp.next;
        head = temp.next;
        temp.next = null;
        return head;
    }
}
