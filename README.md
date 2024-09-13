# PRIMER README

# Explacion De Codigo (AlcanceBalon.Java) Paso a Paso:

###◾Clase AlcanceBalon:

######Defines la clase pública AlcanceBalon, que contiene el método main. Este es el punto de entrada del programa.

###◾Inicialización del objeto Scanner:

######Usas Scanner scanner = new Scanner(System.in); para permitir que el usuario ingrese datos por teclado.

###◾Impresión de la tabla de planetas y gravedades:

######El programa imprime una tabla con diferentes planetas y sus respectivas gravedades mediante un bloque de texto formateado con triple comillas ("""). Se enumeran planetas como Tierra, Marte, Júpiter, etc., y se muestra el valor de la gravedad en cada uno de ellos (en metros por segundo al cuadrado).

```
+-----------+------------+-----+
|  PLANETA  |  GRAVEDAD  |  #  |
+-----------+------------+-----+
|   TIERRA  |    9.81    |  1  |
|   MARTE   |    3.71    |  2  |
|  MERCURIO |    2.78    |  3  |
|   VENUZ   |    8.87    |  4  |
|  JUPITER  |    24.79   |  5  |
|  SATURNO  |    10.44   |  6  |
|   URANO   |    8.87    |  7  |
|  NEPTUNO  |    11.15   |  8  |
+-----------+------------+-----+
```

###◾Ingreso de datos por el usuario:

- ######Se solicita al usuario que ingrese tres valores:
- ######Fuerza con la que va a patear el balón (en algún valor de fuerza arbitrario que el usuario decida).
- ######Ángulo con el que pateará el balón (en grados).
- ######Número del planeta de la lista para el cual se quiere calcular el alcance del balón.

```
double fuerza = scanner.nextDouble();
double grados = scanner.nextDouble();
byte gravedad = scanner.nextByte();
```

###◾Cálculo de componentes de la fórmula:

######Fuerza al cuadrado:

```
double radianes = Math.toRadians(grados*2);
```
######Se eleva al cuadrado la fuerza de pateo, ya que en la fórmula del alcance de un proyectil, la fuerza se eleva al cuadrado.

###◾Ángulo en radianes:

```
double radianes = Math.toRadians(grados*2);
```

######Convierte el ángulo a radianes (multiplicado por 2 porque en la fórmula se usa (2θ)).

###◾Seno del ángulo:

```
double sin = Math.sin(radianes);
```

######Calcula el seno del ángulo en radianes.
###◾Fórmula del alcance:

######La fórmula básica para el alcance de un proyectil es:

[![formula.png](https://i.postimg.cc/cCWgCrL4/formula.png)](https://postimg.cc/r0hFYy4v)

######El código calcula esta fórmula dentro de un (switch) basado en el planeta seleccionado por el usuario. Dependiendo de la gravedad del planeta, se divide el valor de fuerza^2×sin(2θ) dividido por el valor de la gravedad de dicho planeta.

###◾Estructura del switch:

######El switch toma la entrada del usuario (el número del planeta) y ejecuta el caso correspondiente. Calcula la distancia (r) y la imprime.

```
switch (gravedad){
    case 1:{
        double r = cua_fz*sin/9.81;
        System.out.println("la cantidad de metros que recorreo " + r);
        break;
    }
    // Casos para los otros planetas...
}
```

- ######Cada caso representa un planeta y usa la gravedad correspondiente para calcular la distancia. Por ejemplo:
- ######Si elige la Tierra (gravedad = 1), divide el cálculo por 9.81 (gravedad en la Tierra).
- ######Si elige Marte (gravedad = 2), divide por 3.71.
- ######Si el usuario ingresa un número fuera del rango, se ejecuta el default, que informa que la opción es incorrecta.

###◾Resultado esperado:

######Según la fuerza, el ángulo y el planeta seleccionados, el programa imprime la distancia que recorrería el balón en metros, por ejemplo de salida si eliges la Tierra, fuerza de 50 y ángulo de 45 grados:

```
la cantidad de metros que recorreo 255.04985607385223
```

# Explacion De Codigo (Arrays) Paso a Paso:

######Este código Java define una clase llamada Arrays que contiene un método main, el cual se encarga de imprimir datos de tres arreglos diferentes: uno de nombres, uno de edades y uno de estaturas, aquí está el desglose del código:

###◾Definición de la clase:

```
public class Arrays {
```

######Esta es la declaración de la clase pública llamada Arrays.

###◾Método principal (main):

```
public static void main(String[] args) {
```

######Este es el punto de entrada para cualquier programa Java. El método main se ejecuta cuando se inicia el programa.

###◾Declaración de los arreglos:

```
String[] nombres = {"antony", "adannys", "sergio"};
Integer[] edad = {21, 19, 26};
double[] estatura = {1.70, 1.75, 1.80};
```

######Se declaran tres arreglos:

- ######nombres: Un arreglo de tipo String que contiene tres nombres.
- ######edad: Un arreglo de tipo Integer que contiene tres edades.
- ######estatura: Un arreglo de tipo double que contiene tres estaturas.

###◾Bucle for:

```
for (int i = 0; i <= nombres.length -1; i++) {
```

######Este es un bucle for que recorre los arreglos. Empieza en i = 0 y se repite hasta que i es igual al tamaño del arreglo menos uno (nombres.length - 1). Esto asegura que se itere exactamente tantas veces como el número de elementos en los arreglos.

###◾Impresión de los datos: Dentro del bucle, en cada iteración se imprimen los valores correspondientes a cada posición del arreglo:

```
System.out.println("datos del array nombres " + nombres[i]);
System.out.println("datos del array edad " + edad[i]);
System.out.println("datos del array altura " + estatura[i]);
System.out.println("---------------------------------");
```

######Aquí:

- ######Se imprime el nombre en la posición i del arreglo nombres.
- ######Se imprime la edad en la posición i del arreglo edad.
- ######Se imprime la estatura en la posición i del arreglo estatura.
- ######La línea "---------------------------------" se usa para separar los conjuntos de datos de cada iteración.

###◾Resultado
######El programa imprimirá los datos de cada persona (nombre, edad y estatura) en tres líneas por iteración, con una línea separadora entre cada conjunto de datos.
######Por ejemplo, el resultado en la consola será:

```
datos del array nombres antony
datos del array edad 21
datos del array altura 1.7
---------------------------------
datos del array nombres adannys
datos del array edad 19
datos del array altura 1.75
---------------------------------
datos del array nombres sergio
datos del array edad 26
datos del array altura 1.8
---------------------------------
```
