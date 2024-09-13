
package com.poo.principal;
import java.util.Arrays;

public class eliminar {
    public static void main(String[] args) {
        int[] numeros = {50, 70, 750, 12, 45, 63, 38, 99, 3, 1};
        Arrays.sort(numeros);
        int a = numeros.length;
        int b = a-1;
        System.out.println("El número menor es " + numeros[0] + " y el mayor es "
        + numeros[b]);

    }
}
