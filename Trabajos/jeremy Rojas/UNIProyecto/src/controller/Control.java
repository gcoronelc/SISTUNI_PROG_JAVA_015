/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import service.Operation;


/**
 *
 * @author Jeremy
 */
public class Control {
    public static double areaCilindro(double radio, double altura){        
        return Operation.areaCilindro(radio, altura);
    }
    
    public static double volumenCilindro(double radio, double altura){        
        return Operation.volumenCilindro(radio, altura);
    }
    
    public static double areaEsfera(double radio){        
        return Operation.areaEsfera(radio);
    }
    
    public static double volumenEsfera(double radio){
        
        return Operation.volumenEsfera(radio);
    }
    
    public static double areaCono(double radio, double generatriz){
        
        return Operation.areaCono(radio, generatriz);                
    }
    
    public static double volumenCono(double radio, double altura){
        
        return Operation.volumenCono(radio, altura);
    }
    
    public static double areaCubo(double arista){
        
        return Operation.areaCubo(arista);
    }
    
    public double volumenCubo(double arista){
        
        return Operation.volumenCubo(arista);
    }
    
    public double areaParalelepipedo(double largo, double ancho, double altura){
        
        return Operation.areaParalelepipedo(largo, ancho, altura);
    }
    
    public double volumenParalelepipedo(double largo, double ancho, double altura){
        
        return Operation.volumenParalelepipedo(largo, ancho, altura);
    }
    
}
