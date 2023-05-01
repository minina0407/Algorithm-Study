class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
            head = head.next;
        }
        int end = list.size() - 1;
        for (int i = 0; i <= end; i++) {
            if (list.get(i).val == list.get(end).val) {
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
