package y2020.m10.d19;


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
        if (head == null){
            return head;
        }
        ListNode one = head;
        ListNode two = head;
        while (one != null && n > -1){
            one = one.next;
            n--;
        }
        if (n == 0){
            return head.next;
        }
        while (one != null){
            one = one.next;
            two = two.next;
        }
        two.next = two.next.next;
        return head;
    }
}