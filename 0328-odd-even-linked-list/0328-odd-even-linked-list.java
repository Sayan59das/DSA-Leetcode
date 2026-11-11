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
    public ListNode oddEvenList(ListNode head) {
        ListNode temp = head;

        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-2);
        ListNode t1 = odd;
        ListNode t2 = even;
        int count = 1;

        while(temp != null){
            if(count % 2 != 0){
                ListNode x = new ListNode(temp.val);
                t1.next = x;
                temp = temp.next;
                t1 = t1.next;
            }
            else{
                ListNode y = new ListNode(temp.val);
                t2.next = y;
                temp = temp.next;
                t2 = t2.next;
            }
            count+=1;
        }
        t1.next = even.next;
        return odd.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna