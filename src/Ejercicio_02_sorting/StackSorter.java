package Ejercicio_02_sorting;

import materia.Stacks.StackGeneric;

public class StackSorter {

    // Método para ordenar un Stack de tipo Integer
    public void sortStack(StackGeneric<Integer> stack) {
        StackGeneric<Integer> sortedStack = new StackGeneric<>();

        while (!stack.isEmpty()) {
            // Sacamos el primer elemento de la pila original
            int current = stack.pop();

            // Mover elementos de sortedStack al stack original si son mayores que el elemento actual
            while (!sortedStack.isEmpty() && sortedStack.peek() > current) {
                stack.push(sortedStack.pop());
            }

            // Colocamos el elemento actual en el sortedStack
            sortedStack.push(current);
        }

        // Mover los elementos de sortedStack de vuelta a la pila original para que quede en el orden correcto
        while (!sortedStack.isEmpty()) {
            stack.push(sortedStack.pop());
        }
    }
}
