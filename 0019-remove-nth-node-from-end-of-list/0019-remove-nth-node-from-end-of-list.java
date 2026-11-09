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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;
        while(temp.next != null) {
            count++;
            temp = temp.next;
        }
        count++;
        if(count == n) {
            return head.next;
        }
        temp = head;
        int pos = count - n;
        count = 0;
        while(temp.next != null) {
            if(count == pos - 1) {
                ListNode x = temp.next.next;
                temp.next = x;
                break;
            }
            count++;
            temp = temp.next;
        }
        return head;
    }
}
