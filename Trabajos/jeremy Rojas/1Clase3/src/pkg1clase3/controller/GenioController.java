/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1clase3.controller;

import pkg1clase3.service.MyMath;

/**
 *
 * @author Alumno
 */
public class GenioController {
    public long factorial(int num){
        return MyMath.factorial(num);
    }
    public static int mcd(int n1, int n2) {
        int num1,num2,mcd=0,min;
        num1=12;
        num2=15;


        if(num1 < num2){
        min = num1;
        }else{
            min = num2;
        }

       for(int i=1;i<=min;i++){
        if(num1 % i == 0 && num2 % i == 0){
            mcd = i;
            }
        }
        return mcd;
    }
        
        

    public static int mcm(int num1, int num2) {
        
       int mcm,i;
        
        mcm=1;
        i=2;
        while(i <= num1 || i <= num2)
        {
            if(num1%i==0 || num2%i==0)
            {
            mcm=mcm*i;
            if(num1%i==0) num1=num1/i;
            if(num2%i==0) num2=num2/i;
            }
            else
                i=i+1;               
        }                        
        return mcm;                                         
        
        
    }

    public static void fibonacci(int numero) {        
        int fibo1,fibo2,i;
        do{
            System.out.print("Introduce numero mayor que 1: ");
            
        }while(numero<=1);
        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:"); 

        fibo1=1;
        fibo2=1; 

        System.out.println(fibo1 + " ");
        for(i=2;i<=numero;i++){
             System.out.print(fibo2 + " ");
             fibo2 = fibo1 + fibo2;
             fibo1 = fibo2 - fibo1;
             
        }       
    }

    public static boolean esPrimo(int n) {
         
         int a=0,i;        
         for(i=1;i<(n+1);i++){
         if(n%i==0){
             a++;
            }
         }
         if(a!=2){
              return true;
            }else{
                return false;
         }
        
    }
}
