/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.ncty.proyectofinal.service;

import java.util.Arrays;

/**
 *
 * @author Fanoci
 */
public final class Service {

    private Service() {
    }

    public static double circulo(double num) {

        double res = 0;
        double a = 3.1416;

        res = ((num * num) * a);

        return res;

    }

    public static double cuadrado(double num) {

        double res = 0;

        res = num * num;

        return res;

    }

    public static double rectangulo(double num1, double num2) {

        double res;

        res = num1 * num2;

        return res;

    }

    public static double triangulo(double num1, double num2) {

        double res;

        res = ((num1 * num2) / 2);

        return res;
    }

    public static double masAlta(double num1, double num2, double num3, double num4) {
        double notas[] = {num1, num2, num3, num4};
        Arrays.sort(notas);
        return notas[3];
    }

    public static double masBaja(double num1, double num2, double num3, double num4) {
        double notas[] = {num1, num2, num3, num4};
        // double menor = Arrays.stream(notas).min().getAsDouble();
        Arrays.sort(notas);
        return notas[0];
    }
    
    public static double promedio(double num1, double num2, double num3, double num4) {
        double notas[] = {num1, num2, num3, num4};
        double pr = Arrays.stream(notas).average().getAsDouble();
        return pr;        
    }

}
