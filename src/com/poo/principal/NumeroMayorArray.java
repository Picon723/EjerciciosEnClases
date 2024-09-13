package com.poo.principal;

public class NumeroMayorArray {
    public static void main(String[] args) {
        Integer [] numeros = {50, 70, 1, 102};
        Integer mayor = numeros[0];
        Integer menor = numeros[0];

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > mayor){ 
                mayor = numeros[i];
            }
            else if(numeros[i] < menor){ 
                menor = numeros[i];
            }
        }
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
    }
}
