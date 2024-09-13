package com.poo.principal;

import java.util.Scanner;

public class AlcanceBalon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("""
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
                           """);
        
        System.out.println("Ingrese la fuerza con la que va a patear");
        double fuerza = scanner.nextDouble();
        
        System.out.println("Ingrese el angulo con el que va a patear");
        double grados = scanner.nextDouble();
        
        System.out.println("Ingrese el numero del planeta que desea usar");
        byte gravedad = scanner.nextByte();
        
        double cua_fz = Math.pow(fuerza, 2);
        double radianes = Math.toRadians(grados*2);
        double sin = Math.sin(radianes);

        
        switch (gravedad){
            case 1:{
                double r = cua_fz*sin/9.81;
                System.out.println("la cantidad de metros que recorreo " + r);
                break;
            } 
            case 2:{
                double r = cua_fz*sin/3.71;
                System.out.println("la cantidad de metros que recorreo " + r);
                break;
            }
            case 3:{
                double r = cua_fz*sin/2.78;
                System.out.println("la cantidad de metros que recorreo " + r);
                break;
            }
            case 4:{
                double r = cua_fz*sin/8.87;
                System.out.println("la cantidad de metros que recorreo " + r);
                break;
            }
            case 5:{
                double r = cua_fz*sin/24.79;
                System.out.println("la cantidad de metros que recorreo " + r);
                break;
            }
            case 6:{
                double r = cua_fz*sin/10.44;
                System.out.println("la cantidad de metros que recorreo " + r);
                break;
            }
            case 7:{
                double r = cua_fz*sin/8.87;
                System.out.println("la cantidad de metros que recorreo " + r);
                break;
            }
            case 8:{
                double r = cua_fz*sin/11.15;
                System.out.println("la cantidad de metros que recorreo " + r);
                break;
            }
            default: {
                System.out.println("Esta opcion esta incorrecta");
            }
        }
    }
}