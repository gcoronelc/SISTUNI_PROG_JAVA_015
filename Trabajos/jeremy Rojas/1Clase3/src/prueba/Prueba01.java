/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import pkg1clase3.service.MyMath;

/**
 *
 * @author Alumno
 */
public class Prueba01 {
    public static void main(String[] args){
        for (int i = 1; i <= 10; i++) {
            System.out.println("Factorial de "+ i + " es " + MyMath.factorial(i));
        }
    }
    
    
}
