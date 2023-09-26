/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicios2y3y4;

import java.lang.Math;
import java.util.*;

/**
 *
 * @author sebas
 */

public class Ejercicios2y3y4 {
    

    public static void main(String[] args) {
        double a = 4+2*5;
        double b = 23*2/5;
        double c = 46/5;
        double d = 3+5*(10-(2+4));
        double e = 3+5 * (Math.sqrt(10-6));
        double f = (Math.PI)/40;
        double g = 2.1*((Math.E)*4.1);
        
        System.out.println("El resultado es:" + a);
        System.out.println("El resultado es:" + b);
        System.out.println("El resultado es:" + c);
        System.out.println("El resultado es:" + d);
        System.out.println("El resultado es:" + e);
        System.out.println("El resultado es:" + f);
        System.out.println("El resultado es:" + g);
        
        for (int i=1;i<=9;i++){ // imprime 1,2,3,4,5,6,7,8,9
            if (i==9) {
                System.out.print(i);
            } else {
                System.out.print(i + ",");   
            }
        }
        int [][] secuencia = new int[3][3];
        int numero=1;
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                secuencia [i][j]=numero;
                numero++;
            }
        }
        numero=1;
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if (secuencia [i][j]!=(3||6||9)){
                    System.out.println(secuencia [i][j]);
                } else {
                    
                    System.out.println(secuencia [i][j]);
                }
            }
        }
    }
}

