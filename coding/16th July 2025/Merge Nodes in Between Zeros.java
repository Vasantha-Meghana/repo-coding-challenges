//Merge Nodes in Between Zeros
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
    public ListNode mergeNodes(ListNode head) 
    {
        ListNode newHead = new ListNode();
        ListNode t = newHead;
        while(head.next != null)
        {
                head = head.next;
                int sum = 0;
                while(head.val != 0)
                {
                    sum += head.val;
                    head = head.next;
                }
                ListNode newNode = new ListNode(sum);
                t.next = newNode;
                t = t.next;
        }
        return newHead.next;
    }
}
