# Proyecto de Ejercicios: Validación de Signos y Ordenación de Stack

## Descripción
Este proyecto contiene dos ejercicios importantes:

1. **Ejercicio 1: Validación de Signos**  
   El objetivo de este ejercicio es implementar un algoritmo que determine si una cadena de caracteres, que solo contiene los signos `()`, `{}`, `[]`, es válida. La cadena es válida si los corchetes están bien balanceados y en el orden correcto.

2. **Ejercicio 2: Ordenación de un Stack**  
   Este ejercicio implementa un algoritmo que ordena un Stack de enteros, donde el elemento más pequeño se coloca en la parte superior del Stack. Para ello, se utiliza otro Stack auxiliar.

## Estructura del Proyecto

- **SignValidator**: Clase encargada de validar la correcta apertura y cierre de los signos.
- **StackSorter**: Clase encargada de ordenar un Stack utilizando otro Stack adicional.
- **NodeGeneric**: Clase que define un nodo genérico utilizado en la implementación de un Stack genérico.
- **StackGeneric**: Clase que define un Stack genérico.
- **App**: Clase principal que contiene los métodos `runSignValidator` y `runSortStackExample` para ejecutar los ejercicios.

## Instrucciones

### Ejercicio 1: Validación de Signos

El programa valida si una cadena de caracteres con los signos `()`, `{}`, `[]` está correctamente balanceada.

#### Funcionamiento:
1. El usuario ingresa una cadena de signos, por ejemplo: `([]){}`.
2. El algoritmo determina si la cadena está balanceada y en el orden correcto.
3. Si la cadena es válida, se muestra el mensaje: "La cadena es válida."
4. Si no lo es, se muestra el mensaje: "La cadena no es válida."

### Ejercicio 2: Ordenación de un Stack

Este ejercicio implementa un algoritmo que ordena un Stack de enteros, donde el elemento más pequeño se coloca en la parte superior del Stack. Para ello, se utiliza otro Stack auxiliar.

#### Funcionamiento:
1. Se toma un Stack de enteros con elementos desordenados.
2. El algoritmo ordena los elementos utilizando otro Stack auxiliar.
3. El Stack resultante tiene los elementos ordenados de menor a mayor, con el menor en la parte superior.

### Ejercicio 2: Ordenación de un Stack

Este ejercicio implementa un algoritmo que ordena un Stack de enteros, donde el elemento más pequeño se coloca en la parte superior del Stack. Para ello, se utiliza otro Stack auxiliar.

#### Funcionamiento:
1. Se toma un Stack de enteros con elementos desordenados.
2. El algoritmo ordena los elementos utilizando otro Stack auxiliar.
3. El Stack resultante tiene los elementos ordenados de menor a mayor, con el menor en la parte superior.

#### Descripción del Funcionamiento:
El proceso de ordenación funciona de la siguiente manera:

- Se extraen los elementos del Stack original uno por uno.
- Cada elemento extraído se coloca en el Stack auxiliar de manera que este siempre tiene los elementos ordenados de menor a mayor, con el elemento más pequeño en la parte superior.
- Para colocar cada nuevo elemento, el algoritmo compara el nuevo elemento con el que está en la parte superior del Stack auxiliar. Si el nuevo elemento es más grande, se inserta directamente en la parte superior del Stack auxiliar. Si es más pequeño, los elementos más grandes se mueven temporalmente al Stack original hasta que el nuevo elemento encuentra su lugar.
