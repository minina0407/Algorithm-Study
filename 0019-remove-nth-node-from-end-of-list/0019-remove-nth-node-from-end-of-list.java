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
        ArrayList<ListNode> list = new ArrayList<>();
        while (head != null)
        {
            list.add(head);
            head = head.next;
        }
        if (list.size() == 0 || n > list.size())
            return null;
        if (n == list.size())
            return list.get(0).next;
        list.get(list.size() - n - 1).next = list.get(list.size() - n).next;
        return list.get(0);
    }
}