//Merge K Sorted Lists
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
    public ListNode mergeKLists(ListNode[] lists) 
    {
        ArrayList<Integer> arr = new ArrayList<>();
        for(ListNode list : lists)
        {
            while(list != null)
            {
                arr.add(list.val);
                list = list.next;
            }
        }
        Collections.sort(arr);
        ListNode newHead = new ListNode(), temp = newHead;
        for(int ele : arr)
        {
            ListNode newNode = new ListNode(ele);
            temp.next = newNode;
            temp = temp.next;
        }
        return newHead.next;
    }
}
