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
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode temp = head;

        while(temp != null){
            count+=1;
            temp = temp.next;

        }
        int center = (int)(count/2);
        center = center+1;
        temp = head;
        count = 1;
        while(temp != null){
            if(center == count){
                break;
            }
            temp = temp.next;
            count++;
        }

        return temp;
    }
}