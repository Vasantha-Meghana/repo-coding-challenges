//Delete nodes From Linked List Present in Array
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
    public ListNode modifiedList(int[] nums, ListNode head) 
    {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums)
            set.add(ele);
        ListNode Result = new ListNode();
        ListNode temp = Result;
        while(head != null)
        {
            if(!set.contains(head.val))
            {
                ListNode newNode = new ListNode(head.val);
                temp.next = newNode;
                temp = temp.next;
            }
            head = head.next;
        }
        return Result.next;
    }
}
