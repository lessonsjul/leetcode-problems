class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(null, l1, l2);
    }

    public ListNode addTwoNumbers(ListNode current, ListNode l1, ListNode l2) {
        int currentVal = getValue(current);
        ListNode next = getNext(current);

        int sum = currentVal + getValue(l1) + getValue(l2);
        currentVal = sum % 10;
        if (sum / 10 > 0) {
            next = new ListNode(sum / 10);
        }

        ListNode l1Next = getNext(l1);
        ListNode l2Next = getNext(l2);

        if (l1Next != null || l2Next != null) {
            next = addTwoNumbers(next, l1Next, l2Next);
        }

        return new ListNode(currentVal, next);
    }

    private int getValue(ListNode node) {
        return node != null ? node.val : 0;
    }

    private ListNode getNext(ListNode node) {
        return node != null ? node.next : null;
    }
}