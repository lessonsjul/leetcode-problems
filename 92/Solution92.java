class Solution92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        var position = 1;

        var currentNode = head;
        ListNode start = currentNode;
        while (position < left) {
            start = currentNode;
            currentNode = currentNode.next;
            position++;
        }

        ListNode newList = null;
        var tail = currentNode;
        while (position >= left && position <= right) {
            var next = currentNode.next;
            currentNode.next = newList;
            newList = currentNode;
            currentNode = next;
            position++;
        }

        start.next = newList;
        tail.next = currentNode;

        return left > 1 ? head : newList;
    }
}