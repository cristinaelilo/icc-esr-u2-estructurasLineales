package materia.models;

public class LinkedList<T> {
    private NodeGeneric<T> head; // Reference to the first node
    private int size = 0; // Counter for the number of nodes

    public void appendToTail(T value) {
        if (head == null) {
            head = new NodeGeneric<>(value);
        } else {
            NodeGeneric<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new NodeGeneric<>(value));
        }
        size++;
    }

    public void print() {
        if (head == null) {
            System.out.println("END");
            return;
        }
        NodeGeneric<T> current = head;
        while (current != null) {
            System.out.print(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println("END");
    }

    public NodeGeneric<T> getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }
}


