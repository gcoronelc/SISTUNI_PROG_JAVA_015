/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1clase3.service;

/**
 *
 * @author Alumno
 */
public final class MyMath {  // final : poque todos sus metodos van a ser de clase

    public MyMath() {
    }

    public static long factorial(int n) {
        long f = 1;
        while (n > 1) {
            f *= n--;
        }
        return f;
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

    public static int fibonacci(int numero) {        
        int var,a,b;
        var=1;
        b=1;
        a=1;
        for (int i = 0; i < numero; i++) {
           
           a=b;
           b=var;
           var=a+b;
           
           
        }
        return var-a;
        
        
    }

    public static boolean esPrimo(int n) {
         
         int a=0,i;        
         for(i=1;i<(n+1);i++){
         if(n%i==0){
             a++;
            }
         }
         if(a!=2){
              return false;
            }else{
                return true;
         }
        
    }

}
