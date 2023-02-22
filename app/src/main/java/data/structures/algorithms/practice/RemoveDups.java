package data.structures.algorithms.practice;

public class RemoveDups {
     /*
     * Write code to remove duplicates from an unsorted linked list.
     * Solve without using a temporary buffer.
     *
     * Method:
     * Set two pointers to go through the list
     * If the fast pointer == slow pointer, set the slowpointer.next = fastpointer.next (remove the fast item)
     */
    public SinglyLinkedNode RemoveDubs(SinglyLinkedNode head) {
        SinglyLinkedNode fastPointer;
        SinglyLinkedNode slowPointer = head;

        if(head == null) {
            return null;
        }
        else if(head.next != null) {
            fastPointer = head.next;
        }
        else {
            return head;
        }

        while(fastPointer != null) {
            if(slowPointer.data == fastPointer.data) {
                // remove fastPointer item from list
                slowPointer.next = fastPointer.next;
            }
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }
        return head;
    }
}
