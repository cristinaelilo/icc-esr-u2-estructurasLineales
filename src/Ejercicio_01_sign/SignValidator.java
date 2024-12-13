package Ejercicio_01_sign;

import materia.Stacks.StackGeneric;

public class SignValidator {

    // Método para validar una cadena de signos usando StackGeneric
    public static boolean esValido(String s) {
        // Usamos StackGeneric con tipo Character
        StackGeneric<Character> stack = new StackGeneric<>();

        for (char c : s.toCharArray()) {
            // Si es un signo de apertura, lo agregamos al stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // Si es un signo de cierre, verificamos si el stack está vacío o si no coincide con el signo de apertura
                if (stack.isEmpty()) return false;
                char top = stack.pop();  // Obtenemos el valor del nodo superior
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Si el stack está vacío, los signos están balanceados
        return stack.isEmpty();
    }
}
