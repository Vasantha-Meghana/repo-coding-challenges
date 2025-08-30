//Merge in Between Linked Lists
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) 
    {
        int i = 0;
        ListNode node1 = null, node2 = null, temp1 = list1, temp2 = list2;
        while(temp1 != null)
        {
            if(i == a - 1)
                node1 = temp1;
            if(i == b + 1)
            {
                node2 = temp1;
                break;
            }
            temp1 = temp1.next;
            i++;
        }
        while(temp2.next != null)
            temp2 = temp2.next;
        node1.next = list2;
        temp2.next = node2;
        return list1;
    }
}
