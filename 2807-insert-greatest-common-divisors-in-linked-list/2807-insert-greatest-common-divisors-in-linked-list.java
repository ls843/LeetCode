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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode current = head;

        while(current.next != null) {
            int val = calculateGcd(current.val, current.next.val);
            ListNode gcd = new ListNode(val);

            gcd.next = current.next;
            current.next = gcd;

            current = current.next.next;
        }

        return head;
    }

    public int calculateGcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}