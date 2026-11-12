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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode slow = head;
        ListNode fast =  head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode x = reverse(slow.next);
        ListNode y = head;
        Boolean check = true;
        ListNode temp = x;
        while(temp != null){
            if(temp.val == y.val){
                check = true;
            }
            else{
                check = false;
                break;
            }
            temp = temp.next;
            y = y.next;
        }
        x = reverse(slow.next);
        slow.next = x;
        return check;
    }
    ListNode reverse(ListNode head){
        ListNode temp = head;
        ListNode x = temp.next;
        temp.next = null;
        while(x != null){
            ListNode y = x.next;
            x.next = temp;
            temp = x;
            x = y;
        }
        return temp;
    }
}