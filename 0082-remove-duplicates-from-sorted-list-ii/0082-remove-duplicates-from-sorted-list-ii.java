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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        ListNode temp = head;

        while(temp != null){
            if(map.containsKey(temp.val)){
                map.put(temp.val, map.get(temp.val)+1);
            }
            else{
                map.put(temp.val , 1);
            }
            temp = temp.next;
        }

        temp = head;
        ListNode tail = null;
        ListNode newHead = null;
        while(temp != null){
            ListNode next = temp.next;
            if(map.get(temp.val) == 1){
                if(newHead == null){
                    newHead = temp;
                    tail = newHead;
                }
                else{
                    tail.next = temp;
                    tail = tail.next;
                }
            }
            temp = next;
        }
        if(tail != null){
            tail.next = null;
        }
        return newHead;




    }
}