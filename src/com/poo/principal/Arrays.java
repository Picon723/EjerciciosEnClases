package com.poo.principal;

public class Arrays {
    public static void main(String[] args) {
        String[] nombres = {"antony", "adannys", "sergio"};
        Integer[] edad = {21, 19, 26};
        double[] estatura = {1.70, 1.75, 1.80};
        
        for (int i = 0; i <= nombres.length -1; i++) {
            System.out.println("datos del array nombres " + nombres[i]);
            System.out.println("datos del array nombres " + edad[i]);
            System.out.println("datos del array nombres " + estatura[i]);
            System.out.println("---------------------------------");
        } 
    }

    static void sort(int[] numeros) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
