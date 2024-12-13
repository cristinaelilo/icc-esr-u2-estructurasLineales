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
        if (isEmpty()) {
            System.out.println("Pila vacía.");
            return;
        }
    
        NodeGeneric<T> current = top; // Comenzar desde el tope
        StringBuilder result = new StringBuilder();
        
        result.append("(tope) ");  // Agregar "(tope)" al inicio
    
        // Recorrer los elementos de la pila y agregarlos a la cadena
        while (current != null) {
            result.append(current.getValue());
            if (current.getNext() != null) {
                result.append("->"); // Agregar "->" entre los elementos
            }
            current = current.getNext();
        }
    
        System.out.println(result.toString()); // Imprimir la pila con el formato deseado
    }
    
    
}
