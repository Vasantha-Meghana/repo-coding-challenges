//Palindrome Linked List
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
    public boolean isPalindrome(ListNode head) 
    {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        while(temp != null)
        {
            stack.push(temp.val);
            temp = temp.next;
        }
        while(head != null)
        {
            int ele = stack.pop();
            if(ele != head.val)
                return false;
            head = head.next;
        }
        return true;
        
        
        /*
        StringBuilder sb = new StringBuilder();
        while(head != null)
        {
            sb.append(Integer.toString(head.val));
            head = head.next;
        }
        int l = 0, r = sb.length() - 1;
        while(l < r)
        {
            if(sb.charAt(l) != sb.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
        */
    }
}
