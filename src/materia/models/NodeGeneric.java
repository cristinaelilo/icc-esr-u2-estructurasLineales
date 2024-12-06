package materia.models;

public class NodeGeneric<T> {
    private T value;
    private NodeGeneric<T> next;

    // Constructor que inicializa el valor del nodo
    public NodeGeneric(T value) {
        this.value = value;
        this.next = null; // Inicialmente, el siguiente nodo es nulo
    }

    // Getters y Setters
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public NodeGeneric<T> getNext() {
        return next;
    }

    public void setNext(NodeGeneric<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{value=" + value + "}";
    }
}
