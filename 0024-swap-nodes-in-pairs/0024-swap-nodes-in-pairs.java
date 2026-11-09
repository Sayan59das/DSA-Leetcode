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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = head.next;
        ListNode temp1 = head.next.next;

        ListNode x = head;
        ListNode result = temp;

        // First swap
        temp.next = x;
        x.next = temp1;

        ListNode tail = null;
        ListNode z = null;

        while (temp1 != null && temp1.next != null) {

            tail = temp1.next;
            z = tail.next;

            tail.next = temp1;

            temp.next.next = tail;

            temp1.next = z;

            temp = tail;
            temp1 = z;
        }

        return result;
    }
}