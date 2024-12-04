package materia.models;

public class Node {
    private int value; // Propiedad privada que almacena el valor del nodo
    private Node next; // Propiedad privada que almacena la referencia al siguiente nodo

    // Constructor que inicializa el valor del nodo
    public Node(int value) {
        this.value = value;
        this.next = null; // Inicialmente, el siguiente nodo es nulo
    }

    // Getter para el valor del nodo
    public int getValue() {
        return value;
    }

    // Setter para el valor del nodo
    public void setValue(int value) {
        this.value = value;
    }

    // Getter para el siguiente nodo
    public Node getNext() {
        return next;
    }

    // Setter para el siguiente nodo
    public void setNext(Node next) {
        this.next = next;
    }

    // Método para representar el nodo como cadena de texto
    @Override
    public String toString() {
        return "Node{value=" + value + "}";
    }
}

