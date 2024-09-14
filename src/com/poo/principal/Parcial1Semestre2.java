package com.poo.principal;
//grupo formado por: antony picon - adannys calao
public class Parcial1Semestre2 {
    public static void main(String[] args) {
        int dividendo = 56;
        int divisor = 3;
        int resultado = 0;
        
        int r = dividendo - divisor;
              
        for (int i = 1; r >= 0; i++) {
            r = r - divisor;
            
            resultado = resultado + 1;
        }
        int residuo = r + divisor; 
        if (residuo == 0) {
            System.out.println("resultado es: " + resultado);
        }
        else {
            System.out.println("residuo es: " + residuo);
            System.out.println("resultado es: " + resultado);
        }
    }
}
