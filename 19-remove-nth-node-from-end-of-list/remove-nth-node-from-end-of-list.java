class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        int fastCount = 1;
        int slowCount = 0;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            fastCount += 2;
            slowCount++;
        }
        if (fast.next != null) fastCount++;
        final int nodeId = fastCount - n;
        if (nodeId == 0) return head.next;

        ListNode prev;
        ListNode cur;
        int count;
        if (slowCount < nodeId) {
            prev = slow;
            cur = slow.next;
            count = slowCount + 1;
        } else {
            count = 0;
            prev = null;
            cur = head;
        }

        while (count < nodeId) {
            prev = cur;
            cur = cur.next;
            count++;
        }
        prev.next = cur.next;

        return head;
    }
}
