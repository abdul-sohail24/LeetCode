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
    public ListNode deleteMiddle(ListNode head) 
    {
        if(head.next == null)
            return null;
            
        ListNode slow = head;
        ListNode fast = head;
        
        do
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        while(fast!=null && fast.next!=null);
            
        ListNode traverse = head;
        ListNode dummy = traverse;
        while(traverse.next != slow)
            traverse = traverse.next;
        
        traverse.next = slow.next;
        
        return dummy;
    }
}