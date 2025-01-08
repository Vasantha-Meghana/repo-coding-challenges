//Reverse Linked List
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
    public ListNode reverseList(ListNode head) 
    {
        ListNode temp=head;
        ListNode fr=null,prev=null;
        while(temp!=null)
        {
            fr=temp.next;
            temp.next=prev;
            prev=temp;
            temp=fr;
        }
        return prev;
    }
}
