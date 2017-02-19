/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author Jeremy
 */
public class Operation {

    public Operation() {
    }
    
    public static double areaCilindro(double r, double h){
        double a;
        a=2*Math.PI*r*(h+r);
        return a;
    }
    
    public static double volumenCilindro(double r, double h){
        double v;
        v=Math.PI*Math.pow(r, 2)*h;
        return v;
    }
    
    public static double areaEsfera(double r){
        double a;
        a=4*Math.PI*Math.pow(r, 2);
        return a;
    }
    
    public static double volumenEsfera(double r){
        double v;
        v=4*Math.PI*Math.pow(r, 2)/3;
        return v;
    }
    
    public static double areaCono(double r, double g){
        double a;
        a=Math.PI*Math.pow(r, 2)+Math.PI*r*g;
        return a;                
    }
    
    public static double volumenCono(double r, double h){
        double v;
        v=Math.PI*h*Math.pow(r,2)/3;
        return v;
    }
    
    public static double areaCubo(double a){
        double s;
        s=6*Math.pow(a,2);
        return s;
    }
    
    public static double volumenCubo(double a){
        double v;
        v=Math.pow(a,3);
        return v;
    }
    
    public static double areaParalelepipedo(double a, double b, double c){
        double s;
        s=2*a*b+2*b*c+2*a*c;
        return s;
    }
    
    public static double volumenParalelepipedo(double a, double b, double c){
        double v;
        v=a*b*c;
        return v;
    }
    
    
    
}
