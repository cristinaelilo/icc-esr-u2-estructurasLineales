import materia.Stacks.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        runStack();
    }

    public static void runStack() {
        Stack stack = new Stack();

        // Agregar elementos a la pila
        System.out.println("Agregando elementos a la pila...");
        stack.push(10);
        stack.push(5);
        stack.push(7);
        stack.push(15);
        stack.push(20);

        // Mostrar el estado de la pila después de las inserciones
        stack.printStack();
        System.out.println("Tamaño de la pila: " + stack.getSize());
        System.out.println();

        // Operaciones en la pila
        System.out.println("Cima actual -> " + stack.peek());
        System.out.println("Retirar elemento -> " + stack.pop());
        System.out.println("Nueva cima -> " + stack.peek());
        System.out.println("Retirar elemento -> " + stack.pop());
        System.out.println("Nueva cima -> " + stack.peek());

        // Mostrar el estado de la pila después de las operaciones
        System.out.println();
        stack.printStack();
        System.out.println("Tamaño final de la pila: " + stack.getSize());
    }
}

