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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        int carry = 0;

        while(t1 != null || t2 != null){
            int sums = carry;
            if(t1 != null){
                sums+=t1.val;
                t1 = t1.next;
            }
            if(t2 != null){
                sums +=t2.val;
                t2 = t2.next;
            }
            ListNode x = new ListNode(sums % 10);
            carry = sums / 10;
            current.next = x;
            current = current.next;
        }
        if(carry != 0){
            ListNode y = new ListNode(carry);
            current.next = y;
        }

        return dummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna