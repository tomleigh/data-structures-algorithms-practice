package data.structures.algorithms.practice;

/// Class used for singly-linked list data structures.
public class SinglyLinkedNode {
    SinglyLinkedNode next = null;
    int data;

    public SinglyLinkedNode(int d) {
        data = d;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }

        final SinglyLinkedNode other = (SinglyLinkedNode) obj;

        if (this.data != other.data) {
            return false;
        }
        return true;
    }
}

