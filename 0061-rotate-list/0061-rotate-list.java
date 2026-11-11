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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode l1 = head;
        int count = 0;
        while(l1 != null){
            l1 = l1.next;
            count+=1;
        }
        k = k % count;
        if(k == 0){
            return head;
        }
        ListNode temp = head;
        ListNode x = head.next;
        temp.next = null;
        while(x != null){
            ListNode y = x.next;
            x.next = temp;
            temp = x;
            x = y;
        }
        head = temp;
        ListNode prev = null;
        ListNode curr = head;
        int i = 0;
        while(i < k){
            ListNode z = curr.next;
            curr.next = prev;
            prev = curr;
            curr = z;
            i+=1;
        }
        ListNode first = prev;
        ListNode second = curr;
        temp = second.next;
        second.next = null;
        while(temp != null){
            ListNode y = temp.next;
            temp.next = second;
            second = temp;
            temp = y;
        }
        ListNode tail = first;
        while(tail.next != null){
            tail = tail.next;
        }
        tail.next = second;
        head = first;
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna