/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.ncty.proyectofinal.controller;

import pe.ncty.proyectofinal.service.Service;

/**
 *
 * @author Fanoci
 */
public class Controller {

    public double circulo(double num) {
        // throw new UnsupportedOperationException("Not Supported yet." );
        return Service.circulo(num);
    }

    public double cuadrado(double num) {
        // throw new UnsupportedOperationException("Not Supported yet." );
        return Service.cuadrado(num);
    }

    public double rectangulo(double num1, double num2) {
        // throw new UnsupportedOperationException("Not Supported yet." );
        return Service.rectangulo(num1, num2);
    }

    public double triangulo(double num1, double num2) {
        return Service.triangulo(num1, num2);
    }

    public double promedio(double num1, double num2, double num3, double num4) {
        return Service.promedio(num1, num2, num3, num4);
    }

    public double masAlta(int num1, int num2, int num3, int num4) {
        return Service.masAlta(num1, num2, num3, num4);
    }

    public double masBaja(int num1, int num2, int num3, int num4) {
       return Service.masBaja(num1, num2, num3, num4);
    }
}
