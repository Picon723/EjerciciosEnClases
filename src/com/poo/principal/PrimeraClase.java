package com.poo.principal;

public class PrimeraClase {
    public static void main(String[] args) {
        System.out.println("Hola Mundo 😀");
        String nombrePersona = "Antony Picon";
        System.out.println("!!BIENVENIDO¡¡:" + nombrePersona);
        System.out.println(nombrePersona);
        int edad = 15;
        System.out.println("verificacion de edad");
        System.out.println("su edad es:" + edad);
        
        if (edad >= 18){
            System.out.println(nombrePersona + " ustede es mayor de edad");    
        }else {
            System.out.println(nombrePersona + " usted no es mayor de edad");
            System.out.println("nesesita de " + (18-edad) + " años mas");
        }
    }
    
}
