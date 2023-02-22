package data.structures.algorithms.practice;

public class Partition {
    public SinglyLinkedNode PartitionList(SinglyLinkedNode head, int partitionVal) {

        // Create two lists
        // First list stores all values less than partitionVal
        // Second stores all remaining
        // once we reach the end of the target list -> merge the two lists
        SinglyLinkedNode leftPartition;
        SinglyLinkedNode rightPartition;

        while(head != null) {
            // TODO:
            head = head.next;
        }
        return head;
    }
}
