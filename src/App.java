import Models.Pantalla;
import materia.Stacks.Stack;
import materia.Stacks.StackGeneric;

public class App {
    public static void main(String[] args) throws Exception {
        // Ejecutar ejemplos de Stack y StackGeneric
        // runStack();
        runStackGeneric();
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

    public static void runStackGeneric() {
        StackGeneric<Pantalla> router = new StackGeneric<>();

        router.push(new Pantalla(1, "Home Page", "/home"));
        router.push(new Pantalla(1, "Menu Page", "/home/menu"));
        router.push(new Pantalla(1, "Users Page", "/home/menu/users"));

        System.out.println("Estoy en: " + router.peek().getRuta());
        System.out.println("Regreso a: " + ((router.popNode().getNext().getValue())).getRuta());
        System.out.println("Estoy en: " + router.peek().getRuta());

        router.push(new Pantalla(1, "Settings Page", "/home/menu/settings"));

        System.out.println("Pantallas = " + router.getSize());
        System.out.println("Estoy en: " + router.peek().getRuta());
        router.printStack();
    }
}
