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
        if(head == null || k == 0) return head;

        ListNode tail = head;
        int count = 1;

        while(tail.next != null) {
            tail = tail.next;
            count++;
        }

        k = k % count;
        if(k == 0) return head;

        tail.next = head;

        ListNode nthNode = findNthNode(head, count - k);
        head = nthNode.next;

        nthNode.next = null;
        return head;
    }

    public ListNode findNthNode(ListNode current, int k) {
        while(k != 1) {
            current = current.next;
            k--;
        }

        return current;
    }
}