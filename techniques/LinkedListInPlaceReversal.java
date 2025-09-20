/**
 * The Linked List In-place Reversal Technique is used for problems that need reversing parts of a linked list, such as:
 * 	* Reverse entire linked list
 * 	* Reverse a sublist between positions m and n
 * 	* Reverse nodes in k-sized groups
 * 	* Rotate or reorder a linked list
 *
 * It avoids extra space by reversing links directly.
 */
public class LinkedListInPlaceReversal {

    public ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        var current = head;

        while (current != null) {
            var next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
