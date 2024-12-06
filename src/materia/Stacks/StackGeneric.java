package materia.Stacks;

import java.util.EmptyStackException;
import materia.models.NodeGeneric;

public class StackGeneric<T> {
    private NodeGeneric<T> top; // Nodo genérico que apunta al elemento superior
    private int size; // Tamaño de la pila (O(1))

    // Constructor: Inicializa una pila vacía
    public StackGeneric() {
        this.top = null;
        this.size = 0;
    }

    public void push(T data) {
        NodeGeneric<T> newNode = new NodeGeneric<>(data);
        newNode.setNext(top); // El nuevo nodo apunta al actual top
        top = newNode; // El nuevo nodo es ahora el top
        size++; // Incrementar el tamaño
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = top.getValue(); // Obtener el valor del nodo superior
        top = top.getNext(); // Actualizar el top al siguiente nodo
        size--; // Decrementar el tamaño
        return value;
    }

    public NodeGeneric<T> popNode() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        NodeGeneric<T> currentTop = top; // Guardar referencia al nodo actual
        top = top.getNext(); // Actualizar el top al siguiente nodo
        size--; // Decrementar el tamaño
        return currentTop;
    }


    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }

 
    public boolean isEmpty() {
        return top == null;
    }

    public int getSize() {
        return size;
    }

    public void printStack() {
        NodeGeneric<T> current = top; // Comenzar desde el tope
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}
