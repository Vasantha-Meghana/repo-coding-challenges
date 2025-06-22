//Insert Greatest Common Divivsors in Linked List
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
    public int gcd(int a, int b)
    {
        int gcd = Math.min(a, b);
        while(gcd > 0)
        {
            if(a % gcd == 0 && b % gcd == 0)
                break;
            gcd--;
        }
        return gcd;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) 
    {
        ListNode t1 = head, t2 = head.next;
        while(t1.next != null && t2 != null)
        {
            int gcd = gcd(t1.val, t2.val);
            ListNode newNode = new ListNode(gcd);
            t1.next = newNode;
            newNode.next = t2;
            t1 = t2;
            t2 = t2.next;
        }
        return head;
    }
}
