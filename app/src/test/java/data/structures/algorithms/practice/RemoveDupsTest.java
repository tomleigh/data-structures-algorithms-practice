package data.structures.algorithms.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDupsTest {

    @Test
    void removeDubsSimpleTest() {
        RemoveDups removeDups = new RemoveDups();
        SinglyLinkedNode inputNode1 = new SinglyLinkedNode(1);
        SinglyLinkedNode inputNode2 = new SinglyLinkedNode(2);
        SinglyLinkedNode inputNode3 = new SinglyLinkedNode(2);
        SinglyLinkedNode inputNode4 = new SinglyLinkedNode(3);

        inputNode1.next = inputNode2;
        inputNode2.next = inputNode3;
        inputNode3.next = inputNode4;

        SinglyLinkedNode outputNode1 = new SinglyLinkedNode(1);
        SinglyLinkedNode outputNode2 = new SinglyLinkedNode(2);
        SinglyLinkedNode outputNode3 = new SinglyLinkedNode(3);

        outputNode1.next = outputNode2;
        outputNode2.next = outputNode3;


        assertEquals(removeDups.RemoveDubs(inputNode1), outputNode1);
    }

    @Test
    void removeDubsAllSame() {
        RemoveDups removeDups = new RemoveDups();
        SinglyLinkedNode inputNode1 = new SinglyLinkedNode(1);
        SinglyLinkedNode inputNode2 = new SinglyLinkedNode(1);
        SinglyLinkedNode inputNode3 = new SinglyLinkedNode(1);
        SinglyLinkedNode inputNode4 = new SinglyLinkedNode(1);

        inputNode1.next = inputNode2;
        inputNode2.next = inputNode3;
        inputNode3.next = inputNode4;

        SinglyLinkedNode outputNode1 = new SinglyLinkedNode(1);


        assertEquals(removeDups.RemoveDubs(inputNode1), outputNode1);
    }
}