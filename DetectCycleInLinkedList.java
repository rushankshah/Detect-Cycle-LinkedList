import java.util.HashSet;
import java.util.Set;

public class DetectCycleInLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        Node newNode = new Node(4);
        head.next = newNode;
        Node nextNewNode = new Node(5);
        newNode.next = nextNewNode;
        nextNewNode.next = newNode;
        Set<Node> set = new HashSet<>();
        Node curr = head;
        boolean isFound = false;
        while (curr != null) {
            if (set.contains(curr)) {
                isFound = true;
                break;
            } else {
                set.add(curr);
                curr = curr.next;
            }
        }
        if (isFound)
            System.out.println("Loop found");
        else
            System.out.println("Loop not found");
    }
}
