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
    public ListNode doubleIt(ListNode head) {
        head = reverse(head);

        ListNode current = head;
        int carry = 0;

        while(current != null) {
            int doubled = current.val * 2 + carry;

            current.val = doubled % 10;
            carry = doubled / 10;

            if(current.next == null && carry > 0) {
                current.next = new ListNode(carry);
                break;
            }

            current = current.next;
        }

        head = reverse(head);
        return head;
    }

    private ListNode reverse(ListNode node) {
        ListNode prev = null;

        while(node != null) {
            ListNode nextNode = node.next;
            node.next = prev;
            prev = node;
            node = nextNode;
        }

        return prev;
    }
}