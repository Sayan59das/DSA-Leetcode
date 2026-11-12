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
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;

        while(temp != null){
            st.push(temp.val);
            temp = temp.next;
        }

        temp = head;
        Boolean check = true;
        while(temp != null){
            int x = st.peek();
            if(temp.val == x){
                check = true;
            }
            else{
                check = false;
                break;
            }
            temp = temp.next;
            st.pop();
        }
        return check;
    }
}