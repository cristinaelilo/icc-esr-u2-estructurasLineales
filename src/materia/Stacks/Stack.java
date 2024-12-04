package materia.Stacks;

import java.util.EmptyStackException;
import materia.models.Node;

public class Stack {
    private Node top; // Nodo en la cima de nuestra pila
    private int size; 

    // Constructor que inicializa la pila vacía
    public Stack() {
        this.top = null;
        this.size = 0; // Inicialmente la pila está vacía
    }

    // Método para añadir un elemento a la pila
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
        size++; 
    }

    // Método que retira y retorna el elemento de la cima
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int value = top.getValue();
        top = top.getNext();
        size--; 
        return value;
    }

    // Método que retorna el elemento de la cima sin retirarlo
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    // Método que verifica si la pila está vacía
    public boolean isEmpty() {
        return top == null;
    }

    // Método para imprimir los elementos de la pila
    public void printStack() {
        Node current = top;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    // Método para obtener el tamaño de la pila (O(1))
    public int getSize() {
        return size;
    }

    // Método para calcular el tamaño de la pila usando un contador
    //Complejidad O(n)
    //public int getSize() {
        //int size = 0; 
        //Node current = top;
        //while (current != null) {
            //size++;          
            //current = current.getNext(); 
        //}
        //return size; 
    //}*/
}


