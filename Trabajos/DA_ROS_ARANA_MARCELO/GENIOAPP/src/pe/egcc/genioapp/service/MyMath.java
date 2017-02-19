package pe.egcc.genioapp.service;

/**
 *
 * @author Gustavo Coronel
 */
public final class MyMath {

  private MyMath() {
  }

  public static long factorial(int n) {
    long f = 1;
    while (n > 1) {
      f *= n--;
    }
    return f;
  }

  public static int mcd(int a, int b) {

        int x=0,nuevob=0;
        x = a;
 
        if (a < b)
        {
            a = b;
 
            b = x;
            return mcd(a,b);
        }
        else if (b != 0)
        {
            nuevob = a % b;
            a = b;
            b = nuevob;
            return mcd(a,b);
        }
        return a;
  }

  public static int mcm(int a, int b) {

        int m=0;
        m=mcd(a,b);
        return(m*(a/m)*(b/m));
  }

  public static int fibonacci(int n) {
    if (n>1){
       return fibonacci(n-1) + fibonacci(n-2);  //función recursiva
    }
    else if (n==1) {  // caso base
        return 1;
    }
    else if (n==0){  // caso base
        return 0;
    }
    else{ //error
        System.out.println("error");
        return -1; 
    }
  }
public static String fibonacci_serie(int tamaño){
    String cadena="";
    for (int i = 0; i < tamaño; i++) {
        if(i==0)
            cadena=""+fibonacci(i);
        else cadena+=" + "+fibonacci(i);
    }
    return cadena;
}

  public static boolean primo(int n) {    
  int contador = 2;
  boolean primo=true;
  while ((primo) && (contador!=n)){
    if (n % contador == 0)
      primo = false;
    contador++;
  }
  return primo;
  }

}
