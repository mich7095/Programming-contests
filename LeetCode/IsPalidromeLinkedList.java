/**
Given the head of a singly linked list, return true if it is a palindrome.
2.6 Cracking the coding interview
Leetcode 234. Palindrome Linked List

0->1->2->1->0
input: [1,2,2,1] 
output: true
**/
class SolutionLK{

    public static boolean isPalindrome(ListNode head){
        if (head == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode secondHalfHead = reverse(slow.next);
        ListNode firstHalfHead = head;
        while (firstHalfHead != null && secondHalfHead != null) {
            if (firstHalfHead.val != secondHalfHead.val) {
                return false;
            }
            firstHalfHead = firstHalfHead.next;
            secondHalfHead = secondHalfHead.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

    // public class ListNode {
    //     int val;
    //     ListNode next;
    //     ListNode() {}
    //     ListNode(int val) { this.val = val; }
    //     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    // }

}