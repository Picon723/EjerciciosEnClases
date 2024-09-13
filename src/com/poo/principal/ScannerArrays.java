package com.poo.principal;

import java.util.Scanner;

public class ScannerArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String user = "tony";
        int password = 1234;
        
        System.out.println("Ingrese su nombre de usuario");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese su contraseña");
        int clave = scanner.nextInt();
        
        if (user .equals(nombre)){
            if (password == clave){
                System.out.println("su nombre de user y pass es correcto.");
                System.out.println("Bienvenido " + nombre);
            }else {
            System.out.println("su contraseña es incorrecta");   
            }
        }else {
            System.out.println("su usuario es incorrecto");       
        }
    }
}    
    
