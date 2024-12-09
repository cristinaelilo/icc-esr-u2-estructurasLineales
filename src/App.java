import Controller.MenuController;
import Models.Pantalla;
import materia.Queues.Queue;
import materia.Queues.QueueGeneric;
import materia.Stacks.Stack;
import materia.Stacks.StackGeneric;

public class App {
    public static void main(String[] args) throws Exception {
        // Ejecutar ejemplos de Stack y StackGeneric
        // runStack();
        // runStackGeneric();
        // runQueue();
        //runQueueGeneric();
        runContactManager();
    }

    public static void runContactManager() {
        MenuController menuController = new MenuController();
        menuController.showMenu();
        
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

    public static void runQueue() {
        Queue cola = new Queue();
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);
        cola.enqueue(40);

        System.out.println(cola.peek());
        System.out.println(cola.dequeue());
        System.out.println(cola.dequeue());
        System.out.println(cola.peek());
    }

    public static void runQueueGeneric() {
        QueueGeneric<Pantalla> queue = new QueueGeneric<>();

        // Agregar elementos a la cola
        queue.enqueue(new Pantalla(1, "Pantalla Inicio", "/inicio"));
        queue.enqueue(new Pantalla(2, "Pantalla Configuración", "/config"));
        queue.enqueue(new Pantalla(3, "Pantalla Ayuda", "/ayuda"));

        // Imprimir los elementos de la cola
        System.out.println("Contenido inicial de la cola:");
        queue.printQueue();

        // Obtener el tamaño de la cola
        System.out.println("Tamaño de la cola: " + queue.size());

        // Realizar operaciones de dequeue y mostrar resultados
        System.out.println("Retirando elemento: " + queue.dequeue());
        System.out.println("Retirando elemento: " + queue.dequeue());

        // Imprimir los elementos restantes de la cola
        System.out.println("Contenido de la cola después de retirar elementos:");
        queue.printQueue();

        // Tamaño final de la cola
        System.out.println("Tamaño final de la cola: " + queue.size());
    }
}
